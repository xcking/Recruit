package com.cx.entity;

import java.util.Set;

/**
 * Office entity. @author MyEclipse Persistence Tools
 */
public class Office extends AbstractOffice implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Office() {
	}

	/** minimal constructor */
	public Office(String officeName, String officeAccount, String officePassword) {
		super(officeName, officeAccount, officePassword);
	}

	/** full constructor */
	public Office(Company company, String officeName, String officeAccount,
			String officePassword, Set jobs) {
		super(company, officeName, officeAccount, officePassword, jobs);
	}

}
