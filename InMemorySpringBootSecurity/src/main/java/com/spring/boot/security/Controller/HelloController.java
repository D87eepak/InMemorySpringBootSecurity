package com.spring.boot.security.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(value="/hello")
	public String sayHello(){
		return "hello";
	}
	
	@PreAuthorize("hasAnyRole('ADMIN')")
	@RequestMapping(value="/display")
	public String sayDisplay(){
		return "display";
	}
	
	@PreAuthorize("hasAnyRole('USER')")
	@RequestMapping(value="/bye")
	public String sayBye(){
		return "bye";
	}
}
