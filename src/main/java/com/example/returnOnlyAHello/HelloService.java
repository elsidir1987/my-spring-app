package com.example.returnOnlyAHello;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

	
	public String getHelloMessage() {
		return "Hello Eleni";
	}
}
