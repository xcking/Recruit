package com.cx.dao.Impl;

import java.util.List;

import com.cx.dao.JobDao;
import com.cx.entity.Job;

public class JobDaoImpl extends BaseHibDao implements JobDao {

	@Override
	public void AddJob(Job job) {
		super.add(job);
	}

	@Override
	public List<Job> findAllJob() {
		String hql = "from Job";
		return super.search(hql, null);
	}

	@Override
	public List<Job> findByCondition(Job job) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateJob(Job job) {
		super.update(job);
	}

	@Override
	public void deleteJob(int jobId) {
		super.delete(Job.class, jobId);
	}

}
