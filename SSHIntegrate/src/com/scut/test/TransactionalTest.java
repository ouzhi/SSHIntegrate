package com.scut.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.scut.pojo.Manager;

public class TransactionalTest {
	private ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	@Test
	public void testTran() {
		SessionFactory sf = (SessionFactory) ac.getBean("sessionFactory");
		System.out.println(sf);
		Session session = sf.getCurrentSession();
		System.out.println(session);
		
		
//		Manager m = new Manager();
//		m.setUsername("root");
//		m.setPassword("123456");
//		session.save(m);
//		int a = 1 / 0 ;
	}
}
