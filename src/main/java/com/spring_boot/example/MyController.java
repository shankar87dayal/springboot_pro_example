package com.spring_boot.example;

import java.util.HashMap;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/home")
	@ResponseBody
	public String home() {
		System.out.println("this is first controller");
		return "this is just for testing";
	}
	
	@RequestMapping("/collection")
	@ResponseBody
	public HashMap<String, String> Test() {
		System.out.println("this is first controller");
		HashMap<String, String> ob=new HashMap<>();
		ob.put("StudentName", "Ravi ranjan");
		ob.put("cityName", "Patna");
		return ob;
	}
}
