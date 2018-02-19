package com.markey.messageboard.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.markey.messageboard.model.Message;
import com.markey.messageboard.repository.MessageRepository;
import com.markey.messageboard.service.MessageService;

@Service("messageService")
public class MessageServiceImpl implements MessageService{

	@Autowired
	private MessageRepository messageRepository;
	
	@Override
	public Message save(Message message) {
		// TODO Auto-generated method stub
		return messageRepository.save(message);
	}

	@Override
	public Message deleteByMessage(Message message) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message deleteById(String id) {
		// TODO Auto-generated method stub
		Message Result = messageRepository.findOne(id);
		messageRepository.delete(id);
		return Result;
	}

	@Override
	public List<Message> deleteMessages(List<Message> messages) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Message findById(String id) {
		// TODO Auto-generated method stub
		return messageRepository.findOne(id);
	}

	@Override
	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return messageRepository.findAll();
	}

	@Override
	public List<Message> findByLocation(float lng, float lat) {
		// TODO Auto-generated method stub
		return null;
	}

}
