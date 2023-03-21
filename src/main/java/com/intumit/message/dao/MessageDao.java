package com.intumit.message.dao;

import org.springframework.stereotype.Repository;

import com.intumit.message.entity.MessageEntity;

@Repository
public interface MessageDao {
	public void insert(MessageEntity input);

	public MessageEntity findByUserId(MessageEntity input);
}
