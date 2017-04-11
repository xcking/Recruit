package com.cx.dao.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cx.dao.OfficeDao;
import com.cx.entity.Office;

public class OfficeDaoImpl extends BaseHibDao implements OfficeDao {

	@Override
	public Office findOfficeByAccount(String officeAccount) {
		String hql = "from Office where officeAccount =:officeAccount";
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("officeAccount", officeAccount);
		List<Office> oList = super.search(hql, map);
		if (oList != null) {
			for (Office office : oList) {
				return office;
			}
		}
		return null;
	}

	@Override
	public void addOffice(Office office) {
		super.add(office);

	}

	@Override
	public void updateOffice(Office office) {
		super.update(office);
	}

}
