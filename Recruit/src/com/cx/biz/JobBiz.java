package com.cx.biz;

import java.util.List;

import com.cx.entity.Job;

public interface JobBiz {
	public void addJob(Job job);
	public List<Job> findAllJob();	//��ѯ���з����Ĺ���	
	public	List<Job> findByCondition(Job job);		//��������������ѯ����
	public void updateJob(Job job);
	public void deleteJob(int jobId);
}
