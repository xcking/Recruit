package com.cx.dao.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.cx.dao.CompanyDao;
import com.cx.entity.Company;
import com.cx.entity.Job;
import com.cx.entity.Office;

public class CompanyDaoImpl extends BaseHibDao implements CompanyDao {

	@Override
	public Company findCompanyById(int companyId) {
		return 	(Company) super.get(Company.class, companyId);
	}

	@Override
	public Company findCompanyByName(String companyName) {
		String hql = "from Company where companyName =:companyName";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("companyName", companyName);
		List<Company> cList = super.search(hql, map);
		if (cList != null) {
			for (Company company : cList) {
				return company;
			}
		}
		return null;
	}

	@Override
	public void addCompany(Company company) {
		super.add(company);
	}

	@Override
	public void deleteCompany(int companyId) {
		super.delete(Company.class, companyId);

	}

	@Override
	public void updataCompany(Company company) {
		super.update(company);
	}

	@Override
	public Set<Office> findCompanyByOffice() {
		String hql = "from Company  join fetch offices";
		List<Company> cList = super.search(hql, null);
		if (cList!=null ) {
			cList.get(0);
		}
		return null;
	}

	@Override
	public List<Job> findCompanyJob(int companyId) {
		String hql = "select distinct(c.jobs) from Company as c  join  c.jobs where c.companyId = :companyId";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("companyId", companyId);
		List<Job> jList = super.search(hql, map);
		if (jList != null) {
			return jList;
		}
		return null;
	}

}
