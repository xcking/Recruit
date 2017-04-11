package com.cx.action;

import com.cx.biz.DriverBiz;
import com.cx.entity.Driver;
import com.opensymphony.xwork2.ModelDriven;

public class DriverAction extends BaseAction implements ModelDriven<Driver>{
	private Driver driver = new Driver();;
	private DriverBiz driverBiz;
	@Override
	public Driver getModel() {
		return driver;
	}
	
	public DriverBiz getDriverBiz() {
		return driverBiz;
	}

	public void setDriverBiz(DriverBiz driverBiz) {
		this.driverBiz = driverBiz;
	}

	public String toLogin(){
		return "toLogin";
	}
	public String doLogin(){
		Driver driver1 = driverBiz.driverLogin(driver.getDriverAccount(), driver.getDriverPassword());
		if (driver1 !=null) {
			session.setAttribute("driver", driver1);
			return "loginSuccess";
		}
		return "error";
	}
	
	public String toRegister(){
		return "toRegister";
	}
	public String doRegister(){
		driverBiz.driverRegister(driver);
		return "toLogin";
	}
	public String toDetails(){
		return "toDetails";
	}
}
