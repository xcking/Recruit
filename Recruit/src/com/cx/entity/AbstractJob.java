package com.cx.entity;

/**
 * AbstractJob entity provides the base persistence definition of the Job
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractJob implements java.io.Serializable {

	// Fields

	private Integer jobId;
	private Office office;
	private Company company;
	private Integer jobRecruitmentNumber;
	private String jobName;
	private String jobEducationRequire;
	private String jobExperience;
	private String jobDescribe;

	// Constructors

	/** default constructor */
	public AbstractJob() {
	}

	/** full constructor */
	public AbstractJob(Office office, Company company,
			Integer jobRecruitmentNumber, String jobName,
			String jobEducationRequire, String jobExperience, String jobDescribe) {
		this.office = office;
		this.company = company;
		this.jobRecruitmentNumber = jobRecruitmentNumber;
		this.jobName = jobName;
		this.jobEducationRequire = jobEducationRequire;
		this.jobExperience = jobExperience;
		this.jobDescribe = jobDescribe;
	}

	// Property accessors

	public Integer getJobId() {
		return this.jobId;
	}

	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}

	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Integer getJobRecruitmentNumber() {
		return this.jobRecruitmentNumber;
	}

	public void setJobRecruitmentNumber(Integer jobRecruitmentNumber) {
		this.jobRecruitmentNumber = jobRecruitmentNumber;
	}

	public String getJobName() {
		return this.jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	public String getJobEducationRequire() {
		return this.jobEducationRequire;
	}

	public void setJobEducationRequire(String jobEducationRequire) {
		this.jobEducationRequire = jobEducationRequire;
	}

	public String getJobExperience() {
		return this.jobExperience;
	}

	public void setJobExperience(String jobExperience) {
		this.jobExperience = jobExperience;
	}

	public String getJobDescribe() {
		return this.jobDescribe;
	}

	public void setJobDescribe(String jobDescribe) {
		this.jobDescribe = jobDescribe;
	}

}