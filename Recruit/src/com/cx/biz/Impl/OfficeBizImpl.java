package com.cx.biz.Impl;

import com.cx.biz.OfficeBiz;
import com.cx.dao.OfficeDao;
import com.cx.entity.Office;

public class OfficeBizImpl implements OfficeBiz {
	private OfficeDao officeDao;
	
	public void setOfficeDao(OfficeDao officeDao) {
		this.officeDao = officeDao;
	}

	@Override
	public Office officeLogin(String officeAccount, String officePassword) {
		Office office = officeDao.findOfficeByAccount(officeAccount);
		if (office != null) {
			if (office.getOfficePassword().equals(officePassword)) {
				return office;
			}
		}
		return null;
	}

	@Override
	public void officeRegister(Office office) {
		officeDao.addOffice(office);
	}

	@Override
	public void updateOffice(Office office) {
		officeDao.updateOffice(office);
	}

}
