package com.cx.dao.Impl;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.List;


import java.util.Map;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cx.biz.CompanyBiz;
import com.cx.biz.OfficeBiz;
import com.cx.dao.CompanyDao;
import com.cx.dao.HibernateSessionFactory;
import com.cx.dao.OfficeDao;
import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;

public class CompanyDaoImplTest {
	private ApplicationContext applicationContext;
	@Before
	public void setUp() throws Exception {
		applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
	}

	@Test
	public void testFindCompanyByOffice() {
		CompanyBiz companyBiz =  (CompanyBiz) applicationContext.getBean("companyBiz");
		OfficeBiz officeBiz=(OfficeBiz) applicationContext.getBean("officeBiz");
		Office office = officeBiz.officeLogin("li", "123");
		Company company = office.getCompany();                         //companyBiz.findCompanyByOffice(office);
		System.out.println(company.toString());
	}
	 @Test  
	    public void test01(){  
	        Session session=HibernateSessionFactory.getSession();
	        Transaction t=session.getTransaction();  
	        try{  
	            t.begin();  
	            String hql=" select distinct(c.jobs) from Company as c  join  c.jobs where c.companyId = :companyId";  
	            Query query=session.createQuery(hql);
	            Map<String, Object> map = new HashMap<String, Object>();
	            map.put("companyId", 1);
	            query.setProperties(map);
	            List<Job> list= query.list();
	            //对象导航查询  
	            for(Job o:list){  
	                //System.out.println(o[0]+","+o[1]);  
						System.out.println(o.getJobName());
	            	
	            }  
	            t.commit();  
	        }catch (Exception e) {  
	            e.printStackTrace();  
	            t.rollback();  
	        }finally{  
	           session.close();
	        }  
	    }  
}
