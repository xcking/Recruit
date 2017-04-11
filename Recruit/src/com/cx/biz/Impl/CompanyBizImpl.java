package com.cx.biz.Impl;

import java.util.List;
import java.util.Set;

import com.cx.biz.CompanyBiz;
import com.cx.dao.CompanyDao;
import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;

public class CompanyBizImpl implements CompanyBiz {
	private CompanyDao companyDao;
	
	public void setCompanyDao(CompanyDao companyDao) {
		this.companyDao = companyDao;
	}

	@Override
	public Company findCompanyById(int companyId) {
		return companyDao.findCompanyById(companyId);
	}

	@Override
	public Company findCompanyByName(String companyName) {
		return companyDao.findCompanyByName(companyName);
	}

	@Override
	public void addCompany(Company company) {
		companyDao.addCompany(company);
	}

	@Override
	public void deleteCompany(int companyId) {
		companyDao.deleteCompany(companyId);
	}

	@Override
	public void updataCompany(Company company) {
		companyDao.updataCompany(company);
	}

	@Override
	public List<Job> findCompanyJob(int companyId) {
		return companyDao.findCompanyJob(companyId);
	}

	/*@Override
	public Office findCompanyByOffice(Office office) {
		Set<Office> Sc = companyDao.findCompanyByOffice();
		for (Office office2 : Sc) {
			if (office2.equals(office)) {
				return office2;
			}
		}
		return null;
	}*/

}
