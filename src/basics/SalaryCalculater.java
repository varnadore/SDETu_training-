 package basics;

public class SalaryCalculater {
	public static void main(String[] args) {
	
		//declare a Variable 
		String career;
		System.out.println("Program is starting");
	
		//  Defined a variable 
		career = "Software Developer";
		System.out.println("My Career: " + career);
		
		//Declare &  Define 
		int      hoursPerWeek = 40; 
		int      weekPerYear= 50;
		double   rate = 42.50;
		career = "web Developer";
		
		// Most have a compute statement for program to respond
		double salary = hoursPerWeek * weekPerYear * rate;
		System.out.println("My Salary as a " + career + " at the rate of $" + rate + "per hour is $" + salary + " per year ");
		}			
}   


