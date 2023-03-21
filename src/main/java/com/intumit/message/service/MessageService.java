package com.intumit.message.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.intumit.message.entity.MessageEntity;
import com.intumit.message.vo.BasicOut;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MessageService {

	public BasicOut<List<MessageEntity>> initQuery() {
		log.error("");
		BasicOut<List<MessageEntity>> rtnList = new BasicOut<>();
		return rtnList;
	}
}
