package com.lcp.service;

import javax.jms.Destination;

public interface ProducerService {
	
	public void sendMessage(final String msg);

}
