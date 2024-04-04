package com.HAH.scope.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.HAH.scope.model.Counter;

@Controller
public class HomeController {

	@Autowired
	private Counter requestCounter;

	@Autowired
	private Counter sessionCounter;

	@Autowired
	private Counter applicationCounter;

	@GetMapping("/")
	public String index(ModelMap model) {
		model.put("requestCount", requestCounter.CountUp());
		model.put("sessionCount", sessionCounter.CountUp());
		model.put("applicationCount", applicationCounter.CountUp());
		return "home";
	}
}
