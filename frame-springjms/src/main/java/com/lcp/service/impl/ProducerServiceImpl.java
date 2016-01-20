package com.lcp.service.impl;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Service;

import com.lcp.service.ProducerService;
@Service
public class ProducerServiceImpl implements ProducerService {
	@Autowired
	private JmsTemplate jmsTemplate;
	
	@Autowired  
    @Qualifier("queueDestination")   
    private Destination destination;   
	
	public void sendMessage(final String msg) {
		System.out.println("ProducerServiceImpl sendMessage start.....");
		MessageCreator msgCreate=new MessageCreator() {
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		};
		jmsTemplate.send(destination,msgCreate);
	}


	
}
