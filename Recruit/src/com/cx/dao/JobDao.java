package com.cx.dao;

import java.util.List;

import com.cx.entity.Job;

public interface JobDao {
	public void AddJob(Job job);
	public List<Job> findAllJob();	//查询所有发布的工作	
	public	List<Job> findByCondition(Job job);		//根据输入条件查询工作
	public void updateJob(Job job);
	public void deleteJob(int jobId);
}
