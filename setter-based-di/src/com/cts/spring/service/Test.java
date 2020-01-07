package com.cts.spring.service;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.spring.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		SetterBasedInjection setterBasedInjection = context.getBean(SetterBasedInjection.class);
		setterBasedInjection.processMessage("Twitter message sending .... ");
		
	}
}
