package com.cx.biz.Impl;

import com.cx.biz.DriverDetailsBiz;
import com.cx.dao.DriverDetailsDao;
import com.cx.entity.Driver;
import com.cx.entity.Driverdetails;

public class DriverDetailsBizImpl implements DriverDetailsBiz {
	private DriverDetailsDao driverDetailsDao;

	public void setDriverDetailsDao(DriverDetailsDao driverDetailsDao) {
		this.driverDetailsDao = driverDetailsDao;
	}

	@Override
	public void addDetail(Driverdetails driverdetails) {
		driverDetailsDao.addDetails(driverdetails);
	}

	@Override
	public Driverdetails findDetailByDriver(Driver driver) {
		
		return driverDetailsDao.findDetailsByDriver(driver);
	}

}
