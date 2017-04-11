package com.cx.biz.Impl;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.biz.DriverBiz;
import com.cx.biz.DriverDetailsBiz;
import com.cx.entity.Driver;
import com.cx.entity.Driverdetails;

public class DriverDetailsBizImplTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void testAddDetail() {
		DriverDetailsBiz driverDetailsBiz = (DriverDetailsBiz) applicationContext.getBean("driverDetailBiz");
		DriverBiz driverBiz =  (DriverBiz) applicationContext.getBean("driverBiz");
		Driver driver = driverBiz.driverLogin("jim", "123");
		Driverdetails driverdetails = new Driverdetails();
		/*driverdetails.setDirverage(10);
		driverdetails.setCar("厢式货车");
		driverdetails.setAccident("无");
		driverdetails.setDriver(driver);
		driverDetailsBiz.addDetail(driverdetails);
		Driverdetails driverdetails2 =driverDetailsBiz.findDetailByDriver(driver);
		driver.setDriverdetails(driverdetails2);
		driverBiz.updateDriver(driver);*/
		driverdetails.setDirverage(10);
		driverdetails.setCar("厢式货车");
		driverdetails.setAccident("无");
		driverdetails.setDriver(driver);
		driverDetailsBiz.addDetail(driverdetails);
		Driverdetails driverdetails2 =  driverDetailsBiz.findDetailByDriver(driver);
		driver.setDriverdetails(driverdetails2);
		driverBiz.updateDriver(driver);
		
	}

	@Test
	public void testFindDetailByDriver() {
		fail("Not yet implemented");
	}

}
