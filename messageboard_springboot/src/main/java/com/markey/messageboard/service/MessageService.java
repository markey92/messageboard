package com.markey.messageboard.service;

import java.util.List;

import com.markey.messageboard.model.Message;


public interface MessageService {
	public Message save(Message message);
	public Message deleteByMessage(Message message);
	public Message deleteById(String id);
	public List<Message> deleteMessages(List<Message> messages);
	public Message findById(String id);
	public List<Message> findAll();
	public List<Message> findByLocation(float lng, float lat);
}
