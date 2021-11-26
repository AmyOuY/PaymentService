package com.ymou.microservices.PaymentService.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PaymentTB")
public class Payment {

	@Id
	@GeneratedValue
	private int id;	
	
	private int orderId;
	private double amount;
	private String paymentStatus;
	private String transactionId;
	
	
	public Payment() {
		
	}
	
	public Payment(int id, int orderId, double amount, String paymentStatus, String transactionId) {
		super();
		this.id = id;
		this.orderId = orderId;
		this.amount = amount;
		this.paymentStatus = paymentStatus;
		this.transactionId = transactionId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentStatus() {
		return paymentStatus;
	}

	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	
	
}
