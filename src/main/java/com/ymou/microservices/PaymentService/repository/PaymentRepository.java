package com.ymou.microservices.PaymentService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ymou.microservices.PaymentService.entity.Payment;

public interface PaymentRepository extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);
}
