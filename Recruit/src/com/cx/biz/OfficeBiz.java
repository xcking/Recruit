package com.cx.biz;

import com.cx.entity.Office;

public interface OfficeBiz {
	public	Office officeLogin(String officeAccount,String officePassword);
	public void officeRegister(Office office); 
	public void updateOffice(Office office);
}
