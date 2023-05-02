import java.util.Scanner;

public class circleParameters 
{
	public static void main(String[] args) 
	{
		try (Scanner input = new Scanner(System.in)) {
			double radius, diameter, circumfrence, area;

			//Get radius
			System.out.print("Enter Radius: ");
			radius = input.nextDouble();

			//Calculate diameter
			diameter = (radius * 2);
			//Calculate circumfrence
			circumfrence = (Math.PI * (radius * 2));
			//Calculate area
			area = (Math.PI * (radius * radius));
			
			//Display diameter
			System.out.println("Diameter = " + diameter);
			//Display circumfrence
			System.out.println("Circumfrence = " + circumfrence);
			//Display area
			System.out.println("Area = " + area);	
		}
	}
}	