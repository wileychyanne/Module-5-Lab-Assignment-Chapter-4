// import Scanner to get user input
import java.util.Scanner;
public class CoffeeShopMenu {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        // Display coffee shop menu
        System.out.println("Menu");
        System.out.println("Choice Drink");
        System.out.println("1    Espresso");
        System.out.println("2    Latte");
        System.out.println("3    Cappucino");
        System.out.println("4    Mocha");
        // Declare menu variable
        int menu;
        // Ask user to select their drink code
        System.out.print("Enter your choice: ");
        // Read user input, which is an integer
        menu = input.nextInt();
        // create switch
        switch (menu) {
            // evaluate user input for their drink choice and match the code with the case and display the selected drink
            case 1:
                System.out.println("Espresso");
                break;
            case 2:
                System.out.println("Latte");
                break;
            case 3:
                System.out.println("Cappuccino");
                break;
            case 4:
                System.out.println("Mocha");
                break;
                // If the customer enters a number other than 1-4, display Invalid Choice
            default:
                System.out.println("Invalid Choice");
        }
    }
}
