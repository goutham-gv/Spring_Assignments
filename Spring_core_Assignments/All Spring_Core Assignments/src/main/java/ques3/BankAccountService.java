package ques3;

public interface BankAccountService {

	public double withdraw(int accountid,double balance);
	
	public double deposit(int accountid,double balance);
	
	public double getbalance(int accountid);
	
	public boolean fundTransfer(long fromaccount,double toaccount,double Amount);
	
}
