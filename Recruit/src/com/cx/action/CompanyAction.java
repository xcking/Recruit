package com.cx.action;

import java.util.List;

import com.cx.biz.CompanyBiz;
import com.cx.biz.OfficeBiz;
import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;
import com.opensymphony.xwork2.ModelDriven;

public class CompanyAction extends BaseAction implements ModelDriven<Company>{
	private Company company = new Company();
	private CompanyBiz companyBiz;	
	private OfficeBiz officeBiz;
	
	public void setOfficeBiz(OfficeBiz officeBiz) {
		this.officeBiz = officeBiz;
	}
	public void setCompanyBiz(CompanyBiz companyBiz) {
		this.companyBiz = companyBiz;
	}
	@Override
	public Company getModel() {
		return company;
	}
	
	public String toAddCompany(){
		return "toAdd";
	}
	public String doAddCompany(){
		companyBiz.addCompany(company);
		Company company1 = companyBiz.findCompanyByName(company.getCompanyName());
		Office office = (Office) session.getAttribute("office");
		office.setCompany(company1);
		officeBiz.updateOffice(office);
		session.setAttribute("office", office);
		return "addCompanySuccess";
	}
	public String getAlljob(){
		Office office = (Office) session.getAttribute("office");
		List<Job> jList = companyBiz.findCompanyJob(office.getCompany().getCompanyId());
		if (jList != null) {
			request.setAttribute("jList", jList);
		}
		return "getAllJob";
	}
}
