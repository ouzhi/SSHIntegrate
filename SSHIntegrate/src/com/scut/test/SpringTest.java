package com.scut.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.scut.action.LoginAction;
import com.scut.pojo.Manager;

public class SpringTest {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void strutstest() {
		LoginAction la = (LoginAction) ac.getBean("loginAction");
		System.out.println(la);
	}
	
	@Test
	public void testHibernate() {
		SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sf);
	}
	
	public void testTransction() {
		SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
		Session session = sf.getCurrentSession();
		Manager m = new Manager();
		m.setUsername("root");
		m.setPassword("123456");
		session.save(m);
	}

}
