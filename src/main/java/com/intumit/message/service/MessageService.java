package com.intumit.message.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intumit.message.dao.MessageDao;
import com.intumit.message.dao.impl.MessageImpl;
import com.intumit.message.entity.MessageEntity;
import com.intumit.message.vo.BasicOut;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageService {

	public BasicOut<List<MessageEntity>> initQuery() {
		log.debug("MessageService initQuery start...");

		// Configuration 負責管理 Hibernate 配置訊息
		Configuration config = new Configuration().configure();
		// 根據 config 建立 SessionFactory
		// SessionFactory 將用於建立 Session
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 建立DAO物件
		MessageDao messageDao = new MessageImpl(sessionFactory);

		MessageEntity en = new MessageEntity();
		en.setUserId("A123456789");
		MessageEntity r = messageDao.findByUserId(en);

//        User user = new User();
//        user.setName("caterpillar");
//        user.setAge(new Integer(30));

//        userDAO.insert(user);

//        user = userDAO.find(new Integer(1));

		log.debug(r.getUserId() + " : " + r.getMessage());

//		MessageEntity en = new MessageEntity();
//		en.setUserId("A123456789");
//		MessageEntity r = messageDao.findByUserId(en);

		List<MessageEntity> list = new ArrayList<>();
		list.add(r);

		BasicOut<List<MessageEntity>> rtnList = new BasicOut<>();
		rtnList.setData(list);
		return rtnList;
	}

	public String insert(MessageEntity input) {
		// Configuration 負責管理 Hibernate 配置訊息
		Configuration config = new Configuration().configure();
		// 根據 config 建立 SessionFactory
		// SessionFactory 將用於建立 Session
		SessionFactory sessionFactory = config.buildSessionFactory();

		// 建立DAO物件
		MessageDao messageDao = new MessageImpl(sessionFactory);
		messageDao.insert(input);
		return "Success";

	}
}
