package oop;

public class BankAccount {
 	    //Define variable
	String accountNumber;
		//Static >> belongs to the class not the object instance.
		//final >>Constant (often static final)
	private static final String routingNumber = "12345-0987";
	
	//Instance Variables
		private  String name;
		private  String  ssn; 
		String accountType;   
		double balance = 0;
	
		//Constructor definitions : unique Methods 
		//1. Used to define /setup/ initialize properties of an object  
		//2. Constructor are IMPLICITLY called upon INSTANTIATON
		//3. same name as the class itself
	    //4. Constructors have No return type	
    BankAccount() {
    	System.out.println("WELCOME TO  ADVID BANK");
    }
    	//OVERLOADING: CALL THE SAME METHOD NAME WITH A DIFFERENT  ARGUMENT 
    BankAccount (String accountType){
    	System.out.println("New Account:" + accountType);
    }
   
    BankAccount(String accountType, double initDeposit) {
    	//initDeposit, Account type, Msg are all Local Variables
    	System.out.println("New Account:" + accountType);
    	System.out.println(" Intial Deposit of; $" + initDeposit);
    	String Msg = null;
    	if(initDeposit < 1000) {
    	   Msg = "ERROR: Minimum deposit must be ar least $1,000";
    }   else {  
    	  Msg = "Thanks for your initial deposit of: $" + initDeposit; 
    }
    	System.out.println(Msg);
    	balance = initDeposit;
    }   
    	  
    	//Getters/ Setter  //Allow the user to define  the name  
    
    	public void setName(String name ){
    		this.name = "Mr. " +  name;		
    }
    public String  getName () {
          return name ;
    }
    	
    public void setSsn (String ssn)  {
    	  this.ssn = ssn;  
    }
    public String  getSsn () {
         return ssn;
    } 
   
    
   //Defines Methods   
   public  void deposit( double amount) { 	
	   balance = balance + amount;
	   showActivity("DEPOSIT");
    }
    void withdraw(double amount) {	
    	 balance = balance + amount ;
    	 showActivity("WITHDRAW  ");
    }
    private void  showActivity(String activity) {
    	System.out.println( " Your Recent Transaction: " +  activity) ;
    	System.out.println( " Your new balance is: $" + balance );
    } 
    void checkBalance() {
    	System.out.println("Balance: " + balance);
    }
    void getStatus() {	
    }
    
    
    
    @Override
    public String toString() {
    	return  "[ NAME: " +  name  + ".  ACCOUNT#"  + accountNumber + ". ROUTING #"  + routingNumber  + "' Balance: $" + balance + "]";
    	
    }
}