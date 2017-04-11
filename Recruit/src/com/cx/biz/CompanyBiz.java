package com.cx.biz;

import java.util.List;

import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;

public interface CompanyBiz {
	public Company findCompanyById(int companyId);
	public Company findCompanyByName(String companyName);
	//public Office findCompanyByOffice(Office office);
	public List<Job> findCompanyJob(int companyId);
	public void addCompany(Company company);
	public void deleteCompany(int companyId);
	public void updataCompany(Company company);
}
