package com.klef.jfsd.springboot;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController 
{
	@GetMapping("/")
	public String home()
	{
		return "index"; //index.html
	}
	
	
	@GetMapping("demo")
	public String demo(Model model)
	{
		model.addAttribute("name", "JFSD");
		return "demo";
	}
	
	
	@GetMapping("viewall")
	public String viewallstudents(Model model)
	{
		List<Student> students = new ArrayList<Student>();
		students.add(new Student(1, "KLU", "FEMALE", 35));
		students.add(new Student(2, "ASHESH", "MALE", 40));
		students.add(new Student(3, "JFSD", "OTHERS", 4));
		students.add(new Student(4, "TATWA", "MALE", 19));
		
		model.addAttribute("students", students);
		
		return "viewallstudents";
	}
}
