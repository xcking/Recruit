package com.cx.action;

import com.cx.biz.OfficeBiz;
import com.cx.entity.Office;
import com.opensymphony.xwork2.ModelDriven;

public class OfficeAction extends BaseAction implements ModelDriven<Office> {
	private Office office = new Office();
	private OfficeBiz officeBiz;
	
	public void setOfficeBiz(OfficeBiz officeBiz) {
		this.officeBiz = officeBiz;
	}

	@Override
	public Office getModel() {
		return office;
	}
	public String toLogin(){
		return "toLogin";
	}
	public String doLogin(){
		Office office1 = officeBiz.officeLogin(office.getOfficeAccount(), office.getOfficePassword());
		if (office1 != null) {
			session.setAttribute("office", office1);
			return "LoginSuccess";
		}
		return "error";
	}
	public String toRegister(){
		return "register";
	}
	public String doRegister(){
		officeBiz.officeRegister(office);
		return "toLogin";
	}
}
