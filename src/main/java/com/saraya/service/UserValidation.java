package com.saraya.service;

import org.springframework.stereotype.Service;

@Service
public class UserValidation {
	public boolean isValid(String name, String pass) {
		return name.equalsIgnoreCase("konate") && pass.equals("becaye");
	}
}
