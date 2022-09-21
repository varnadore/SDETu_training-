package basics;

public class Weather {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature = 63; 
		String sunCondition = "Sunny";
		
		if (temperature > 80)  
		{ System.out.println("It's a pleasent day. Wear shorts and t-shirts");
		}
			else if ((temperature > 60) && (sunCondition == "Sunny"))
			{
			System.out.println("It's  a little cooler. Wear a long-sleeve shirt and jeans");
			System.out.println("This would be a great day to wear your wig and hat.");
		}
			
			else if (temperature > 100) {
			System.out.println("Too Hot! Stay inside until cooler weather.");	
			}
					
			else 
			{
				System.out.println("Looks like a cold day in Florida.");
			}
	}
}


	      
