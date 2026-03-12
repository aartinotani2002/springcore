package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Snacks {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Snacks() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Snacks [subject=" + subject + "]";
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Starting Method");
	}
	
	@PreDestroy
	public void end() {
		System.out.println("Ending Method");
	}

}
