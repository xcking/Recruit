package com.cx.dao;

import com.cx.entity.Office;

public interface OfficeDao {
	public Office findOfficeByAccount(String officeAccount);		//�����˻������û�
	public void addOffice(Office office);
	public void updateOffice(Office office);
}
