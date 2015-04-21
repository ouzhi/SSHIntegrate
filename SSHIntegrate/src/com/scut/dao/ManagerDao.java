package com.scut.dao;

import com.scut.pojo.Manager;

public interface ManagerDao {
	public abstract Manager findOneManager(String username, String password);
}
