package com.cx.action;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.biz.DriverBiz;
import com.cx.dao.DriverDao;
import com.cx.entity.Driver;

public class DriverActionTest {
	private ApplicationContext applicationContext;

	@Before
	public void setUp() throws Exception {
		
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void testDoLogin() {
		DriverBiz driverBiz=   (DriverBiz) applicationContext.getBean("driverBiz");
		Driver driver = driverBiz.driverLogin("jim", "123");
		System.out.println(driver);
	}

}
