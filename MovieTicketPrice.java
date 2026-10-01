// Write a program using nested if statements to decide the ticket price category.
import java.util.Scanner;
public class MovieTicketPrice {
    public static void main(String[] args) {
        // make new scanner
        Scanner input = new Scanner(System.in);
        // Declare variables and read user input
        int age;
        String studentID;
        String weekday;
        System.out.print("Enter your age: ");
        age = input.nextInt();
        // Check if age is under 12, if so get child discount
        if (age < 12) {
            System.out.println("Child Discount");
        }
        else {
            // Check if age is between 12 and 18
            if (age <= 18) {
                // If yes, check if they have a studentID
                System.out.print("Do you have a student ID? (yes/no): ");
                studentID = input.next();
                if (studentID.equals("yes"))
                    System.out.println("Student Discount");

                else {
                    System.out.println("Full Price");
                }
            }
            else {
                // everything else is ages above 18, so check if it is Wednesday
                // if so, apply Midweek Discount
                System.out.print("Is today Wednesday? (yes/no): ");
                weekday = input.next();
                if (weekday.equals("yes")) {
                    System.out.println("Midweek Discount");
                }
                else {
                    // otherwise display full price
                    System.out.println("Full Price");
                }
            }
        }
    }
}