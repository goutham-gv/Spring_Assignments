package ques3;

import org.springframework.context.annotation.Bean;

public class BankAccountController {
	
	public double withdraw(int accountid,double balance) {
		return 0;
	}
	
	public double deposit(int accountid,double balance) {
		return 0;
	}
	
	public double getbalance(int accountid) {
		return 0;
	}
	
	public boolean fundTransfer(long fromaccount,double toaccount,double Amount) {
		return false;
	}


	@Bean
	public BankAccountController get() {
		return new BankAccountController();
}
	
	@Bean
	public BankAccountServiceImpl set() {
		return new BankAccountServiceImpl();
}
	
}
