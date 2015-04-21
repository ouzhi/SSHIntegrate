package com.scut.service.impl;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.scut.dao.ManagerDao;
import com.scut.pojo.Manager;
import com.scut.service.ManagerService;

@Service
@Transactional
public class ManagerServiceImpl implements ManagerService {

	@Resource
	private ManagerDao managerDao;
	@Override
	public Manager queryOne(String username, String password) {
		return managerDao.findOneManager(username, password);
	}

}
