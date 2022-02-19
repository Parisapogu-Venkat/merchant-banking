package com.sbi.retail.banking.resource;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sbi.retail.banking.dto.AccountDetails;

@RestController
public class CASAResource {
	@GetMapping(path = "/casa",produces = "application/json")
	public ResponseEntity<AccountDetails> casaEnquiry(@RequestParam("accountNumber") String accountNumber) {
		System.out.println("Request from client: "+accountNumber);
		
		AccountDetails accountDetails=new AccountDetails();
		 accountDetails=new AccountDetails();
		accountDetails.setAccountHolderName("Pithre/Goya");
		System.out.println("Deleted here.");
		System.out.println("Modified..........");
		accountDetails.setAccountNo("A/c123432");
		accountDetails.setCurrentAccountBalance(20000);
		accountDetails.setSavingsAccountBalance(50000);
		System.out.println("Developed");
		System.out.println("Added");
		return new ResponseEntity<AccountDetails>(accountDetails,HttpStatus.OK);
	}
}
