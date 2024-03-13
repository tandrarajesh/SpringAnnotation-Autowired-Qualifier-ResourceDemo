package com.mphasis.api;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.mphasis.app.Payment;

@Component
@PropertySource(value =  { "classpath:application.properties" })
public class UserPaymentService {

	/*
	 * @Autowired
	 * 
	 * @Qualifier("phonePe")
	 */
	@Resource(name= "${beanName}")
	private Payment payment;
	
	public String processPayment() {
		return payment.doTransaction();
	}
}
