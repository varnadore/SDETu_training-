package oop;

public class BankAccountApp {

	public static void main(String[] args) {
		// creating a  bank account.>>think instantiate an object  
		
		BankAccount acc1 = new BankAccount();
		
		//acc1.name = "Anthony D Varnadore"; (old Way)
		// With Encapsulation : Public API method  
		acc1.setName ( "Anthony D Varnadore") ;  
		System.out.println(acc1.getName() ) ;  
		
		acc1.setSsn( "262-89-4628");
		System.out.println("SSN: " + acc1.getSsn() ) ;
		
		
		acc1.accountNumber = "12345-0987"; 
		acc1.balance= 10000; 
		
		acc1.deposit(1500);
		acc1.deposit(1500);
		acc1.deposit(1500);
	    acc1.withdraw(2000);
		
		System.out.println(acc1.toString());
		/*
		BankAccount acc2 = new BankAccount("Checking Account");  
		acc2.accountNumber = "12345-0987";
		
		BankAccount acc3 = new BankAccount("Savings Account $", 5000);
		acc3.accountNumber = "12345-0987";  
		acc3.checkBalance();
		
		
		//Demo For inheritance 
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Anthony Varnadore";
		cd1.accountType = "CD Account ";
 		System.out.println(cd1.toString());
 		cd1.Compound();
 		*/   
	} 
 
}        