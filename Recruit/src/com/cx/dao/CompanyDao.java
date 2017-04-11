package com.cx.dao;

import java.util.List;
import java.util.Set;

import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;

public interface CompanyDao {
	public Company findCompanyById(int companyId);
	public Company findCompanyByName(String companyName);
	public Set<Office> findCompanyByOffice();	//根据职员查询同一公司的同事
	public List<Job> findCompanyJob(int companyId);	//查询同公司发布的所有职位
	public void addCompany(Company company);
	public void deleteCompany(int companyId);
	public void updataCompany(Company company);
}
