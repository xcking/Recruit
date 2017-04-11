package com.cx.action;

import com.cx.biz.CompanyBiz;
import com.cx.biz.JobBiz;
import com.cx.entity.Job;
import com.cx.entity.Office;
import com.opensymphony.xwork2.ModelDriven;

public class JobAction extends BaseAction implements ModelDriven<Job> {
	private Job job = new Job();
	private JobBiz jobBiz;
	private CompanyBiz companyBiz;
	
	public void setCompanyBiz(CompanyBiz companyBiz) {
		this.companyBiz = companyBiz;
	}

	public void setJobBiz(JobBiz jobBiz) {
		this.jobBiz = jobBiz;
	}

	@Override
	public Job getModel() {
		return job;
	}
	
	//转到发布职位
	public String toAddJob(){
		return "toAddJob";
	}
	//发布职位
	public String doAdd(){
		if (job!=null) {
			Office office = (Office) session.getAttribute("office");
			job.setOffice(office);
			job.setCompany(office.getCompany());
			jobBiz.addJob(job);
			return "addSuccess";
		}
		return "adderror";
	}
	public String toError(){
		return "error";
	}
}
