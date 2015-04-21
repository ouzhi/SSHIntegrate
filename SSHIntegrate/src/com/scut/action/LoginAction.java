package com.scut.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionSupport;
import com.scut.dao.ManagerDao;
import com.scut.dao.imol.ManagerDaoImpl;
import com.scut.pojo.Manager;
import com.scut.service.ManagerService;

@Controller
public class LoginAction extends ActionSupport {
	
	@Resource
	private ManagerService managerService;
	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String execute() {
		Manager m = managerService.queryOne(username, password);
		if(m != null) return SUCCESS;
		return ERROR;
	}
}
