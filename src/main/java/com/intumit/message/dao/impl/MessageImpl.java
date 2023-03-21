package com.intumit.message.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.intumit.message.dao.MessageDao;
import com.intumit.message.entity.MessageEntity;

@Repository
public class MessageImpl implements MessageDao {
	private SessionFactory sessionFactory;

	public MessageImpl() {
	}

	public MessageImpl(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void insert(MessageEntity input) {
		// 取得Session
		Session session = sessionFactory.openSession();
		// 開啟交易
		Transaction tx = session.beginTransaction();
		// 直接儲存物件
		session.save(input);
		// 送出交易
		tx.commit();
		session.close();

	}

	@Override
	public MessageEntity findByUserId(MessageEntity input) {
		Session session = sessionFactory.openSession();

		MessageEntity rtn = session.get(MessageEntity.class, input.getUserId());

		session.close();

		return rtn;
	}
}
