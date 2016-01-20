package com.lcp.service;

import javax.jms.Destination;

public interface ConsumerMsgListenerService {
	
	public void sendMessage(Destination destination,final String msg);

}
