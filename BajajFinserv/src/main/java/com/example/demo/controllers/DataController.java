package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entites.Data;
import com.example.demo.services.DataService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class DataController {

	@Autowired
	DataService dataService;
	
	@SuppressWarnings("null")
	@PostMapping("/bfhl")
	public Data getData(@RequestParam String[] values) {
		Data d = new Data();
		char []ch;
		String []str = null;
		int strCount=0;
		int []number = null;
		int numberCount=0;
		for(int i=0; i<values.length; i++) {
			if( (values[i].equals("a") && values[i].equals("z")) || (values[i].equals("A") && values[i].equals("Z"))){
				str[strCount] = values[i];
				strCount++;
			}
			else {
				number[numberCount] = Integer.parseInt(values[i]);
			}		
		}
		
		Data d1 = new Data(true,d.getUser_id(),d.getEmail(),d.getRoll_number(),number,str);
		
		return d1;
	}
	
	
}













