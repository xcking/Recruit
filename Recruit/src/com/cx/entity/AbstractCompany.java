package com.cx.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractCompany entity provides the base persistence definition of the
 * Company entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCompany implements java.io.Serializable {

	// Fields

	private Integer companyId;
	private String companyName;
	private String companyAddress;
	private String companyScale;
	private String companyField;
	private String companyHomepage;
	private Set offices = new HashSet(0);
	private Set jobs = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractCompany() {
	}

	/** minimal constructor */
	public AbstractCompany(String companyName, String companyAddress) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
	}

	/** full constructor */
	public AbstractCompany(String companyName, String companyAddress,
			String companyScale, String companyField, String companyHomepage,
			Set offices, Set jobs) {
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.companyScale = companyScale;
		this.companyField = companyField;
		this.companyHomepage = companyHomepage;
		this.offices = offices;
		this.jobs = jobs;
	}

	// Property accessors

	public Integer getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyAddress() {
		return this.companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getCompanyScale() {
		return this.companyScale;
	}

	public void setCompanyScale(String companyScale) {
		this.companyScale = companyScale;
	}

	public String getCompanyField() {
		return this.companyField;
	}

	public void setCompanyField(String companyField) {
		this.companyField = companyField;
	}

	public String getCompanyHomepage() {
		return this.companyHomepage;
	}

	public void setCompanyHomepage(String companyHomepage) {
		this.companyHomepage = companyHomepage;
	}

	public Set getOffices() {
		return this.offices;
	}

	public void setOffices(Set offices) {
		this.offices = offices;
	}

	public Set getJobs() {
		return this.jobs;
	}

	public void setJobs(Set jobs) {
		this.jobs = jobs;
	}

}