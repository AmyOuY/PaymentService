package com.ymou.microservices.PaymentService.service;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ymou.microservices.PaymentService.entity.Payment;
import com.ymou.microservices.PaymentService.repository.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repo;
	
	
	public Payment addPayment(Payment payment) {		
		payment.setPaymentStatus(processPayment());
		payment.setTransactionId(UUID.randomUUID().toString());
		return repo.save(payment);
	}
	
	
	public String processPayment() {
		return new Random().nextBoolean() ? "success" : "failure";
	}
	
	
	public Payment getPaymentByOrderId(int orderId) {
		return repo.findByOrderId(orderId);
	}
}
