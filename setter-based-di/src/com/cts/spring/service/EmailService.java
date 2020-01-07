package com.cts.spring.service;

import org.springframework.stereotype.Service;

@Service("EmailService")
public class EmailService implements MessageService {

	@Override
	public void sendMessage(String message) {
		System.out.println(message);
	}

}
