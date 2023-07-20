package millionaireBankAccount;
import java.util.Scanner;

public class millionaireBankAccount {

	public static void main(String[] args) 
	{
		try (Scanner stdIn = new Scanner(System.in)) {
            System.out.println("Enter starting balance:");
            double deposit = stdIn.nextDouble();
            double balance = 0;
            balance = Math.abs( deposit + 0 );
            int count = 0;
            
            
            while ( balance < 100_000) 
            {
            	balance = Math.abs(balance * 2);
            	count++;
            }
            System.out.println(count + " Years until you reach $100,000.");
            
            while (balance < 1_000_000) 
            {
            	balance = Math.abs(balance * 2);
            	count++;
            }
            System.out.println(count + " Years until you reach $1,000,000.");
        }	
	}
 
}