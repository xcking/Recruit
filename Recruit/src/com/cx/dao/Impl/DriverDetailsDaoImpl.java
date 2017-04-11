package com.cx.dao.Impl;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cx.dao.DriverDetailsDao;
import com.cx.entity.Driver;
import com.cx.entity.Driverdetails;

public class DriverDetailsDaoImpl extends BaseHibDao implements DriverDetailsDao {

	@Override
	public void addDetails(Driverdetails driverdetails) {
		super.add(driverdetails);

	}

	@Override
	public Driverdetails findDetailsByDriver(Driver driver) {
		String hql = "from Driverdetails  where driver = :driver";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("driver", driver);
		List<Driverdetails> dList = super.search(hql, map);
		if (dList != null) {
			for (Driverdetails driverdetails : dList) {
				return driverdetails;
			}
		}
		return null;
	}

}
