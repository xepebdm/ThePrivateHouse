package com.maven.privatehouse.user.dao;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.maven.privatehouse.user.UserBean;

public class UserBeanDAO {

	public void add(UserBean user, EntityManager em) {
		try {
			em.persist(user);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			em.flush();
			em.close();
		}
	}
	
//	public void remove(UserBean user, EntityManager em) {
//		try {
//			em.remove(user.getId());
//		}catch(Exception e) {
//			e.printStackTrace();
//		}finally {
//			em.flush();
//			em.close();
//		}
//	}
	
	public void edit(UserBean user, EntityManager em) {
		try {
//			Query editUser = "UPDATE REGISTER_USER SET NAME = :uName, NICK = :uNick, EMAIL = :uEmail, PASSWORD = :uPassword WHERE ID = :uId";
//			em.persist(editUser);
		}catch(Exception e){
			e.printStackTrace();
		}finally {
			em.flush();
			em.close();
		}
	}
}
