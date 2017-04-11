package com.cx.dao;

import java.util.List;
import java.util.Set;

import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;

public interface CompanyDao {
	public Company findCompanyById(int companyId);
	public Company findCompanyByName(String companyName);
	public Set<Office> findCompanyByOffice();	//����ְԱ��ѯͬһ��˾��ͬ��
	public List<Job> findCompanyJob(int companyId);	//��ѯͬ��˾����������ְλ
	public void addCompany(Company company);
	public void deleteCompany(int companyId);
	public void updataCompany(Company company);
}
