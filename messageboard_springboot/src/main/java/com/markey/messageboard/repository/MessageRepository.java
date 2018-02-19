package com.markey.messageboard.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.markey.messageboard.model.Message;

@Repository
//@Transactional
public interface MessageRepository extends MongoRepository<Message, String> {

}
