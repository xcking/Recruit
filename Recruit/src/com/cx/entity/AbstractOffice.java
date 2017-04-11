package com.cx.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractOffice entity provides the base persistence definition of the Office
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOffice implements java.io.Serializable {

	// Fields

	private Integer officeId;
	private Company company;
	private String officeName;
	private String officeAccount;
	private String officePassword;
	private Set jobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractOffice() {
	}

	/** minimal constructor */
	public AbstractOffice(String officeName, String officeAccount,
			String officePassword) {
		this.officeName = officeName;
		this.officeAccount = officeAccount;
		this.officePassword = officePassword;
	}

	/** full constructor */
	public AbstractOffice(Company company, String officeName,
			String officeAccount, String officePassword, Set jobs) {
		this.company = company;
		this.officeName = officeName;
		this.officeAccount = officeAccount;
		this.officePassword = officePassword;
		this.jobs = jobs;
	}

	// Property accessors

	public Integer getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getOfficeName() {
		return this.officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public String getOfficeAccount() {
		return this.officeAccount;
	}

	public void setOfficeAccount(String officeAccount) {
		this.officeAccount = officeAccount;
	}

	public String getOfficePassword() {
		return this.officePassword;
	}

	public void setOfficePassword(String officePassword) {
		this.officePassword = officePassword;
	}

	public Set getJobs() {
		return this.jobs;
	}

	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}

}