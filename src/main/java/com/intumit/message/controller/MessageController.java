package com.intumit.message.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.intumit.message.entity.MessageEntity;
import com.intumit.message.service.MessageService;
import com.intumit.message.vo.BasicOut;

@Controller
public class MessageController {

	@Autowired
	MessageService messageService;

	@RequestMapping("/hello")
	public BasicOut<List<MessageEntity>> initQuery() {
		BasicOut<List<MessageEntity>> rtnList = messageService.initQuery();
		return rtnList;
	}
}
