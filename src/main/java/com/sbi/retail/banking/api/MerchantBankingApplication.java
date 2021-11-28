package com.sbi.retail.banking.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.sbi.retail.banking")
public class MerchantBankingApplication {

	public static void main(String[] args) {
		SpringApplication.run(MerchantBankingApplication.class, args);
	}

}
//http://localhost:4040/casa?accountNumber=12321