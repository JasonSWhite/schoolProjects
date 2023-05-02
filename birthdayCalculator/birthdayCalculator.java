import java.util.Scanner;

public class birthdayCalculator {

    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            String month;
            int day, year;

            //Enter user's birthday
            System.out.println("Enter the month you were born: ");
            month = input.nextLine();

            System.out.print("Enter the day you were born: ");
            day = input.nextInt();

            System.out.println("Enter the year you were born: ");
            year = input.nextInt();

            //Calculate 100th birth date
            year = year + 100;

            //Display 100th birthdate
            System.out.println("You will be 100 on " + month + " " + day 
              + " " + year);
        }
    }
}