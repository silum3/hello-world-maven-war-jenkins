package com.examplejar.demojar1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@SpringBootApplication
public class Demojar1Application {

	public static void main(String[] args) {
		SpringApplication.run(Demojar1Application.class, args);
	}
	@RequestMapping("/hello")
	@ResponseBody
	String str()
	{
		return "hello";
	}
}
