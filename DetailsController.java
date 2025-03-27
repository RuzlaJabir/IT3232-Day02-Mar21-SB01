package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class DetailsController {
	@GetMapping("/details")
	public String myDetails() {
		String name = "Name: Ruzla";
		String regno = "Reg_No: 2020ICT82";
		String age = "Age: 23";
		String course = "Course: IT";
		
		return name + "<br>" + regno + "<br>" + age + "<br>" + course;
	}

}

