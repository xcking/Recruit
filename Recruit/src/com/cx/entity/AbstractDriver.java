package com.cx.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractDriver entity provides the base persistence definition of the Driver
 * entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDriver implements java.io.Serializable {

	// Fields

	private Integer driverId;
	private Driverdetails driverdetails;
	private String driverName;
	private String driverAccount;
	private String driverPassword;
	private String driverSex;
	private Integer driverAge;
	private Set driverdetailses = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDriver() {
	}

	/** minimal constructor */
	public AbstractDriver(String driverName, String driverAccount,
			String driverPassword) {
		this.driverName = driverName;
		this.driverAccount = driverAccount;
		this.driverPassword = driverPassword;
	}

	/** full constructor */
	public AbstractDriver(Driverdetails driverdetails, String driverName,
			String driverAccount, String driverPassword, String driverSex,
			Integer driverAge, Set driverdetailses) {
		this.driverdetails = driverdetails;
		this.driverName = driverName;
		this.driverAccount = driverAccount;
		this.driverPassword = driverPassword;
		this.driverSex = driverSex;
		this.driverAge = driverAge;
		this.driverdetailses = driverdetailses;
	}

	// Property accessors

	public Integer getDriverId() {
		return this.driverId;
	}

	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}

	public Driverdetails getDriverdetails() {
		return this.driverdetails;
	}

	public void setDriverdetails(Driverdetails driverdetails) {
		this.driverdetails = driverdetails;
	}

	public String getDriverName() {
		return this.driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getDriverAccount() {
		return this.driverAccount;
	}

	public void setDriverAccount(String driverAccount) {
		this.driverAccount = driverAccount;
	}

	public String getDriverPassword() {
		return this.driverPassword;
	}

	public void setDriverPassword(String driverPassword) {
		this.driverPassword = driverPassword;
	}

	public String getDriverSex() {
		return this.driverSex;
	}

	public void setDriverSex(String driverSex) {
		this.driverSex = driverSex;
	}

	public Integer getDriverAge() {
		return this.driverAge;
	}

	public void setDriverAge(Integer driverAge) {
		this.driverAge = driverAge;
	}

	public Set getDriverdetailses() {
		return this.driverdetailses;
	}

	public void setDriverdetailses(Set driverdetailses) {
		this.driverdetailses = driverdetailses;
	}

}