package com.cx.dao;

import com.cx.entity.Driver;
import com.cx.entity.Driverdetails;

public interface DriverDetailsDao {
	public void addDetails(Driverdetails driverdetails);
	public Driverdetails findDetailsByDriver(Driver driver);
}
