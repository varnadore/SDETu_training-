package oop;

  class Person {
	
	String name;
	String email;
	String phone;
		
	void walk() {
		System.out.println(name + " is walking to London ");	
	}
	
	void eat() {
		System.out.println("without his personal email " + email);
	}
	
	void sleep() {
		System.out.println( "for " + name + " will not be able to sleep in the house");
	}
  }
	
	public class Demo {
	
		public static void main(String[] args){ 
			Person person1 = new Person(); //Instantiating an object to the class \\
			
			// Defines some properties
			person1.name = "Antonio";
			person1.email = "Tony@gmail.com" ;
			person1.phone = "334.300.9832" ;
	    
			//abstraction
			person1.walk ();
			person1.eat();
			person1.sleep();
	}

	/*
	// Attributes, variables, adjectives, description 
		
		String name  = "Joe";
		String email = " Joe@testemail.com ";
		String phone = " 3343009832 ";
		
	// action, activity, behavior
		System.out.print(name +" is eating ");
		System.out.print(name +" is walking ");
		
	//What if we wanted to do this for another person 

		String name2  = " Joy " ;
		String email2 = " Joy@testemail.com ";	
		String phone2 = "3343004500";
		
	// action, activity, behavior
		System.out.print(name2 +" is eating ") ;
		System.out.print(name2 +" is walking ") ;
		*/
	}









