// import Scanner for user input
import java.util.Scanner;
public class SchoolReportCard {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);
        // declare grade and subject variables
        int grade;
        // ask user to enter the average grade and read input
        System.out.print("Enter student's average grade: ");
        grade = input.nextInt();
        // ask user to enter the subject code and read input
        int subject;
        System.out.print("Enter subject code (1-Math, 2-Science, 3-English): ");
        subject = input.nextInt();
        // check if grade is above 90, if so print excellent
        if (grade > 90) {
            System.out.println("Grade: Excellent");
        }
        // else holds all grades 90 and under
        else {
            // check if grade is between 75 and 90, if so print good
            if (grade >= 75) {
                System.out.println("Grade: Good");
            }
            // otherwise print needs improvement
            else {
                System.out.println("Grade: Needs Improvement");
                }
            }

        // create switch
        switch (subject) {
            // evaluate user input for subject and match the code with the subject
            case 1:
                System.out.println("Subject: Math");
                break;
            case 2:
                System.out.println("Subject: Science");
                break;
            case 3:
                System.out.println("Subject: English");
                break;
            default :
                System.out.println("Invalid subject code");
        }
    }
}
