package com.cx.entity;

import java.util.Set;

/**
 * Driverdetails entity. @author MyEclipse Persistence Tools
 */
public class Driverdetails extends AbstractDriverdetails implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public Driverdetails() {
	}

	/** minimal constructor */
	public Driverdetails(Driver driver, Integer dirverage, String car,
			String accident) {
		super(driver, dirverage, car, accident);
	}

	/** full constructor */
	public Driverdetails(Driver driver, Integer dirverage, String car,
			String accident, String remarks, Integer tel, String address,
			Set drivers) {
		super(driver, dirverage, car, accident, remarks, tel, address, drivers);
	}

}
