package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")

public class MainController {
	
	@GetMapping()	
	public String index(Model model) {
		String name = "Best of the year by " + "Giuseppe";
		model.addAttribute("name", name);
		return "index";
	}

}
