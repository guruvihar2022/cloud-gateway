package com.verizon.cloud.gateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

	@GetMapping("/medicineServiceFallBack")
	public String medicineSerivceFallBackMethod() {
		return "Medicine service fall back method -call back";
	}
	
	@GetMapping("/invoiceServiceFallBack")
	public String invoiceServiceFallBackMethod() {
		return "Invoice service fall back method- call back";
	}
}
