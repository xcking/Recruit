package com.cx.entity;

import java.util.Set;

/**
 * Company entity. @author MyEclipse Persistence Tools
 */
public class Company extends AbstractCompany implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Company() {
	}

	/** minimal constructor */
	public Company(String companyName, String companyAddress) {
		super(companyName, companyAddress);
	}

	/** full constructor */
	public Company(String companyName, String companyAddress,
			String companyScale, String companyField, String companyHomepage,
			Set offices, Set jobs) {
		super(companyName, companyAddress, companyScale, companyField,
				companyHomepage, offices, jobs);
	}

}
