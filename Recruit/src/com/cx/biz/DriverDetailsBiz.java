package com.cx.biz;

import com.cx.entity.Driver;
import com.cx.entity.Driverdetails;

public interface DriverDetailsBiz {
	public void addDetail(Driverdetails driverdetails);
	public Driverdetails findDetailByDriver(Driver driver);
}
