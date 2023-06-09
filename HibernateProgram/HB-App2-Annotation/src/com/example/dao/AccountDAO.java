package com.example.dao;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.example.bean.AccountBean;
import com.exmple.util.SessionUtil;

public class AccountDAO {
	
	public AccountBean getAccoountDetails(long accNo) {
		
		Session session = null;
		AccountBean bean = null;
		
		try {
			
			session=SessionUtil.getSession();
			bean = (AccountBean)session.get(AccountBean.class, accNo);
			
		}catch (HibernateException e) {
			e.printStackTrace();
		}finally {
			
			SessionUtil.closeSession(session);
		}
		
		return bean;
	}

	
	public void insertAccountDetails(AccountBean bean) {
		
		Session session = null;
		
		try {
			
			session = SessionUtil.getSession();
			session.getTransaction().begin();
			session.save(bean);
			session.getTransaction().commit();
			
		}catch (HibernateException e) {
			
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			
			SessionUtil.closeSession(session);
		}
		
	}
	
	
	public void updateAccountDetails(AccountBean bean) {
		
		Session session = null;
		
		try {
			
			session = SessionUtil.getSession();
			session.getTransaction().begin();
			session.update(bean);
			session.getTransaction().commit();
			
		}catch (HibernateException e) {
			
			session.getTransaction().rollback();
			e.printStackTrace();
		}finally {
			
			SessionUtil.closeSession(session);
		}
	}
	
	public void deleteAccountDetails(long accNo) {
		
		Session session = null;
		Transaction transaction = null;
		
		try {
			session = SessionUtil.getSession();
			transaction = session.beginTransaction();
			AccountBean accountBean = (AccountBean)session.get(AccountBean.class, accNo);
			session.delete(accountBean);
			transaction.commit();
		}catch (HibernateException e) {
			if(transaction!=null) {
			transaction.rollback();
			}
			e.printStackTrace();
			
		}finally {
			
			SessionUtil.closeSession(session);
		}	
	}
}