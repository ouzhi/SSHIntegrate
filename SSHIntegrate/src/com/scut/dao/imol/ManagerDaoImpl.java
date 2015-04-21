package com.scut.dao.imol;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.scut.dao.ManagerDao;
import com.scut.pojo.Manager;

@Repository
@Transactional
public class ManagerDaoImpl implements ManagerDao {

	@Resource
	private SessionFactory sf;
	
	public Session getSession() {
		return sf.getCurrentSession();
	}
	@Override
	public Manager findOneManager(String username, String password) {
		String hql = "from Manager m where m.username = ? "
				+ "and m.password = ?" ;
		Query query = getSession().createQuery(hql);
		query.setParameter(0, username);
		query.setParameter(1, password);
		Manager manager = (Manager) query.uniqueResult();
		return manager;
	}

}
