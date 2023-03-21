package com.intumit.message.controller;

import java.util.List;

import org.apache.poi.ss.formula.functions.T;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intumit.message.entity.MessageEntity;
import com.intumit.message.service.MessageService;
import com.intumit.message.vo.BasicOut;

@RestController
@RequestMapping("/hello")
public class MessageController {

	@Autowired
	MessageService messageService;

	@GetMapping("/initQuery")
	public BasicOut<List<MessageEntity>> initQuery() {
		BasicOut<List<MessageEntity>> rtnList = messageService.initQuery();
		return rtnList;
	}

	@PostMapping("/insert")
	public BasicOut<T> insert(@RequestBody MessageEntity input) {
		messageService.insert(input);
		BasicOut<T> basicOut = new BasicOut<>();
		basicOut.setStatus("insert Success");
		return basicOut;
	}
}
