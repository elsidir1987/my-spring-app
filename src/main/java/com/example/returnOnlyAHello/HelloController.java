package com.example.returnOnlyAHello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	private HelloService hs;
	
	public HelloController(HelloService hs) {
		this.hs=hs;
	}
	@GetMapping("/hello")
	public String sayHello() {
		return hs.getHelloMessage();
	}
}
