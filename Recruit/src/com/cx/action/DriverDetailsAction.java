package com.cx.action;

import com.cx.biz.DriverBiz;
import com.cx.biz.DriverDetailsBiz;
import com.cx.entity.Driver;
import com.cx.entity.Driverdetails;
import com.opensymphony.xwork2.ModelDriven;

public class DriverDetailsAction extends BaseAction implements ModelDriven<Driverdetails> {
	private Driverdetails driverdetails = new Driverdetails();
	private DriverDetailsBiz driverDetailsBiz;
	private DriverBiz driverBiz;
	
	public void setDriverBiz(DriverBiz driverBiz) {
		this.driverBiz = driverBiz;
	}

	public void setDriverDetailsBiz(DriverDetailsBiz driverDetailsBiz) {
		this.driverDetailsBiz = driverDetailsBiz;
	}

	@Override
	public Driverdetails getModel() {
		return driverdetails;
	}
	/*
	 * 跳转用户详细信息页面
	 * */
	public String toDetails(){
		return "toDetails";
	}
	/*
	 * 将用户详细信息上传至数据库并更新用户
	 * */
	public String doDetails(){
		Driver driver = (Driver) session.getAttribute("driver");
		driverdetails.setDriver(driver);
		System.out.println(driverDetailsBiz == null);
		driverDetailsBiz.addDetail(driverdetails);
		Driverdetails driverdetails2 =  driverDetailsBiz.findDetailByDriver(driver);
		driver.setDriverdetails(driverdetails2);
		driverBiz.updateDriver(driver);
		session.setAttribute("driver", driver);
		return "homepage";
	}
}
