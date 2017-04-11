package com.cx.entity;

/**
 * Job entity. @author MyEclipse Persistence Tools
 */
public class Job extends AbstractJob implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Job() {
	}

	/** full constructor */
	public Job(Office office, Company company, Integer jobRecruitmentNumber,
			String jobName, String jobEducationRequire, String jobExperience,
			String jobDescribe) {
		super(office, company, jobRecruitmentNumber, jobName,
				jobEducationRequire, jobExperience, jobDescribe);
	}

}
