package com.mphasis.app;

import org.springframework.stereotype.Service;

@Service
public class PhonePe implements Payment{

	@Override
	public String doTransaction() {
		
		return "payment process using PhonePe..!";
	}

	
}
