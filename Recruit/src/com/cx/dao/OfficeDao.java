package com.cx.dao;

import com.cx.entity.Office;

public interface OfficeDao {
	public Office findOfficeByAccount(String officeAccount);		//根据账户名查用户
	public void addOffice(Office office);
	public void updateOffice(Office office);
}
