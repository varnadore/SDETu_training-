package basics;

public class Cities {

	public static void main(String[] args) {
		// Declare and define an array
	String[] Cities ={"New-york", "San Fransco","Miami","Dallas","Ebro"};
	 System.out.println("Cities" +"," + " " + Cities [0]);
	 System.out.println("Cities" +"," + " " + Cities[1]);
	 System.out.println("Cities" +"," + " " + Cities[2]);
	 System.out.println("Cities" +"," + " " + Cities[3]);
	 System.out.println("Cities" +"," + " " + "My Home State" + "," + " " + Cities[4]);
	
	// makes a break line
		System.out.println("*****************");
	 
	 //Declare an array
	String[] Countries;
	
	//Define the array 
	Countries = new String [3];
		Countries[0] = "USA";
		Countries[1] = "Mexico";
		Countries[2] = "Canada";
	System.out.println("Country" +"," + " " + Countries[0]);
	System.out.println("Country" +"," + " " + Countries[2]);
	System.out.println("Country" +"," + " " + Countries[1]);
	
	 //2nd way to declare and define array ( Only Size)
	/*String[] States = new String[5];
	 		 States[0] = "California";
			 States[1] = "Texes";
			 States[2] = "Florida";
			 States[3] = "Tennessee";		 		 
			 States[4] = "Virginia";
	System.out.println(States[0]);
	System.out.println(States[4]);
	System.out.println(States[2]);*/

	// makes a break line
	System.out.println("*****************");
			
	//Loop example, enter the loop and TEST conditions
	String[] States = new String[5];
	 States[0] = "California";
	 States[1] = "Texes";
	 States[2] = "Florida";
	 States[3] = "Tennessee";		 		 
	 States[4] = "Virginia";
	 // to loop we use [i]
	 int i = 0;
	 do {
		 System.out.println("States" + "," + " " + States [i]);
		 i = i + 1; 
	    } while (i < 5);
	 
	 // loop example, test conditions first and then enter loop
	 int n = 0; 
	 while(n < 5) {
		 System.out.println("States at" + " " + n + ":" + States [n]);	
		 n++;
	 }
	 // another way to add a break line 
		 System.out.println("\nprinting with loops"); 
	// "for" loops are the best structures for iterating through an array 
		 
		 for(int x = 0; x < 5; x++) {
		 System.out.println("States"+ "," + " " + States[x]); 	 
		 
	 }
  }	
}
 