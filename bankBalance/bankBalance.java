import java.util.Scanner;

public class bankBalance {

	public static void main(String[] args) 
	{
		try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("Enter starting balance:");
            double sb = stdIn.nextDouble();					// sb = starting balance
            double b= 0;									// b = balance
            b = Math.abs(sb + 0);
            int count = 0;
            
            
            while ( b < 100_000) 
            {
            	b = Math.abs(b * 2);
            	count++;
            }
            System.out.println(count + " Years until you reach $100,000.");
            
            while (b < 1_000_000) 
            {
            	b = Math.abs(b * 2);
            	count++;
            }
            System.out.println(count + " Years until you reach $1,000,000.");
        }	
	}
 
}
