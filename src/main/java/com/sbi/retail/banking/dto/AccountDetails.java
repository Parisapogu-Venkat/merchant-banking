package com.sbi.retail.banking.dto;
import java.io.Serializable;

public class AccountDetails implements Serializable {
	private static final long serialVersionUID = 1L;
	private String accountHolderName;
	private String accountNo;
	private Integer currentAccountBalance;
	private Integer savingsAccountBalance;
	private Integer minimumBalance = 500;

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public Integer getCurrentAccountBalance() {
		return currentAccountBalance;
	}

	public void setCurrentAccountBalance(Integer currentAccountBalance) {
		this.currentAccountBalance = currentAccountBalance;
	}

	public Integer getSavingsAccountBalance() {
		return savingsAccountBalance;
	}

	public void setSavingsAccountBalance(Integer savingsAccountBalance) {
		this.savingsAccountBalance = savingsAccountBalance;
	}

	public Integer getMinimumBalance() {
		return minimumBalance;
	}

	public void setMinimumBalance(Integer minimumBalance) {
		this.minimumBalance = minimumBalance;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("AccountDetails [accountHolderName=");
		builder.append(accountHolderName);
		builder.append(", accountNo=");
		builder.append(accountNo);
		builder.append(", currentAccountBalance=");
		builder.append(currentAccountBalance);
		builder.append(", savingsAccountBalance=");
		builder.append(savingsAccountBalance);
		builder.append(", minimumBalance=");
		builder.append(minimumBalance);
		builder.append("]");
		return builder.toString();
	}
}
