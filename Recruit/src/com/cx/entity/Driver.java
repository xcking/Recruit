package com.cx.entity;

import java.util.Set;

/**
 * Driver entity. @author MyEclipse Persistence Tools
 */
public class Driver extends AbstractDriver implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Driver() {
	}

	/** minimal constructor */
	public Driver(Driverdetails driverdetails, String driverName,
			String driverAccount, String driverPassword) {
		super(driverName, driverAccount, driverPassword);
	}

	/** full constructor */
	public Driver(Driverdetails driverdetails, String driverName,
			String driverAccount, String driverPassword, String driverSex,
			Integer driverAge, Set driverdetailses) {
		super(driverdetails, driverName, driverAccount, driverPassword,
				driverSex, driverAge, driverdetailses);
		// TODO Auto-generated constructor stub
	}

}
