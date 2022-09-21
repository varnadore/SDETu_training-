package basics;

public class NumbersCalc {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		System.out.println("Programming is started");
		 printName();
		  int numA =10;
		  int numB =20;
		 addNumbers(numA,numB);
		 int product = multiplyNumbers(numA,numB); 
		//System.out.println("The product of numbers " + numA + " and " + numB + " is " + multiplyNumbers(numA,numB)); /* option 1 of 2 */
	    System.out.println("The product of numbers " + numA + " and " + numB + " is " + product); 
	  }	
	 static void printName() {
		System.out.println("Anthony Varnadore C404");
		}		
	 static void addNumbers(int numberA, int numberB){
		  int sum = numberA + numberB;
		System.out.println("the sum of numbers " + numberA + " and " + numberB + " is " + sum);	
		}
     static int multiplyNumbers(int valueA, int valueB) { 
          int product = valueA * valueB;
        return product;
        }
       }
	

	