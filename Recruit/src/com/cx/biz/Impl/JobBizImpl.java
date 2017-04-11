package com.cx.biz.Impl;

import java.util.List;

import com.cx.biz.JobBiz;
import com.cx.dao.JobDao;
import com.cx.entity.Job;

public class JobBizImpl implements JobBiz {
	private JobDao jobDao;
	
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}

	@Override
	public void addJob(Job job) {
		jobDao.AddJob(job);
	}

	@Override
	public List<Job> findAllJob() {
		return jobDao.findAllJob();
	}

	@Override
	public List<Job> findByCondition(Job job) {
		return jobDao.findByCondition(job);
	}

	@Override
	public void updateJob(Job job) {
		jobDao.updateJob(job);
	}

	@Override
	public void deleteJob(int jobId) {
		jobDao.deleteJob(jobId);
	}

}
