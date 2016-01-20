package com.lcp.service.impl;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

public class ConsumerMsgListenerServiceImpl implements MessageListener  {


	public void onMessage(Message msg) {
		System.out.println("ConsumerMsgListenerServiceImpl onMessage start....");
		TextMessage textMsg=(TextMessage) msg; 
		System.out.println("收到的消息内容是"+ textMsg);
		
	}

}
