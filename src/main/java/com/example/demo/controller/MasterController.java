package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("MainController")
public class MasterController {

	@RequestMapping("DemoAPI")
	@ResponseBody
	public String index() {
		System.out.println("inside controller");
		return "Congrats you have Deployed the application!!";
	}
}
