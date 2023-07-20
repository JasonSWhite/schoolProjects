import java.util.Scanner;

public class economicPolicy 
{

	public static void main(String[] args) 
	{
		
		try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("Enter Growth Rate (in precentage):");
            double growthRate = stdIn.nextDouble();
            System.out.println("Enter Inflation Rate (in percentage):");
            double inflationValue = stdIn.nextDouble();
            
             if (growthRate > 1) 
               {
            	
            	 if (inflationValue > 3)
            	  {
            		
                	System.out.println("Policy states to increase welfare spending, reduce personal taxes," +
                    " and decrease discount rate.");
            	  }
            	
            	else 
            		{
            			System.out.println("Policy states to decrease buisness taxes.");
            		}
               }
            
             else if  (growthRate < 4) 
              {
            	
            	if (inflationValue > 1) 
            	{
            	  System.out.println("Policy states to increase personal and business taxes and decrease" +
            	    " discount rate.");
            	}
            	
            	else if (inflationValue < 3 ) 
            	{
            	  System.out.println("Policy states to increase discount rate.");
            	}
             }
            
             else 
              {
            	 System.out.println("No change in economic policy.");
              }
        }
	}
}