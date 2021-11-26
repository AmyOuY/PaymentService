package com.ymou.microservices.PaymentService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ymou.microservices.PaymentService.entity.Payment;
import com.ymou.microservices.PaymentService.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	
	@PostMapping("/addPayment")
	public ResponseEntity<Payment> addPayment(@RequestBody Payment newPayment){
		Payment payment = service.addPayment(newPayment);
		return new ResponseEntity<Payment>(payment, HttpStatus.CREATED);
	}
	
	
	@GetMapping("/{orderId}")
	public ResponseEntity<Payment> getPaymentInfoByOrderId(@PathVariable int orderId){
		Payment payment = service.getPaymentByOrderId(orderId);
		return new ResponseEntity<Payment>(payment, HttpStatus.OK);
	}
}
