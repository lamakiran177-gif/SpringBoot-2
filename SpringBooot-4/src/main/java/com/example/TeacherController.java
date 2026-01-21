package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {
	
	@GetMapping("getData")  
	public Teacher hello()
	{
		Teacher te=new Teacher();
		te.setId(1);
		te.setName("kiran");
		te.setCity("Kathmandu");
		
		return te;
	}

}
