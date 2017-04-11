package com.cx.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * AbstractDriverdetails entity provides the base persistence definition of the
 * Driverdetails entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDriverdetails implements java.io.Serializable {

	// Fields

	private Integer driverDetailsId;
	private Driver driver;
	private Integer dirverage;
	private String car;
	private String accident;
	private String remarks;
	private Integer tel;
	private String address;
	private Set drivers = new HashSet(0);

	// Constructors

	/** default constructor */
	public AbstractDriverdetails() {
	}

	/** minimal constructor */
	public AbstractDriverdetails(Driver driver, Integer dirverage, String car,
			String accident) {
		this.driver = driver;
		this.dirverage = dirverage;
		this.car = car;
		this.accident = accident;
	}

	/** full constructor */
	public AbstractDriverdetails(Driver driver, Integer dirverage, String car,
			String accident, String remarks, Integer tel, String address,
			Set drivers) {
		this.driver = driver;
		this.dirverage = dirverage;
		this.car = car;
		this.accident = accident;
		this.remarks = remarks;
		this.tel = tel;
		this.address = address;
		this.drivers = drivers;
	}

	// Property accessors

	public Integer getDriverDetailsId() {
		return this.driverDetailsId;
	}

	public void setDriverDetailsId(Integer driverDetailsId) {
		this.driverDetailsId = driverDetailsId;
	}

	public Driver getDriver() {
		return this.driver;
	}

	public void setDriver(Driver driver) {
		this.driver = driver;
	}

	public Integer getDirverage() {
		return this.dirverage;
	}

	public void setDirverage(Integer dirverage) {
		this.dirverage = dirverage;
	}

	public String getCar() {
		return this.car;
	}

	public void setCar(String car) {
		this.car = car;
	}

	public String getAccident() {
		return this.accident;
	}

	public void setAccident(String accident) {
		this.accident = accident;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Integer getTel() {
		return this.tel;
	}

	public void setTel(Integer tel) {
		this.tel = tel;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set getDrivers() {
		return this.drivers;
	}

	public void setDrivers(Set drivers) {
		this.drivers = drivers;
	}

}