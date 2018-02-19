package com.markey.messageboard.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.markey.messageboard.model.Message;
import com.markey.messageboard.service.MessageService;

@RestController
@RequestMapping(value={"/api/v1"})
public class MessageController {

	@Resource(name="messageService")
	MessageService messageService;


	@RequestMapping(value = "/messages", method = RequestMethod.GET, produces={"application/json;charset=UTF-8"})
	public List<Message> getMessages(){
		List<Message> messages = messageService.findAll();
		
		return messages;
	}
	@RequestMapping(value = "/messages", method = RequestMethod.POST, produces={"application/json;charset=UTF-8"})
	public Message getMessagesByLocation(@RequestBody Message message){
		/*
		 * 验证一下输入参数
		 */
		
		Message result = messageService.save(message);
		return result;
	}
}
