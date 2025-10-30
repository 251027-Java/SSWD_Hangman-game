import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Grader {


    public static void main(String[] args) {

        // Check values to make sure it is not less than 0 or more than 100

        Scanner scanner = new Scanner(System.in);
        double grade = -1;
        boolean invalidInput = true;

        while(invalidInput){
            try{
                System.out.println("Please enter a score between 0 and 100: ");
                grade = scanner.nextDouble();
                if ((grade <= 100) && (grade >= 0)) {
                    invalidInput = false;
                } else {
                    System.out.println("That number was out of range. Try again");
                }

            } catch (Exception e){
                System.out.println("That wasn't a number!");
                scanner.next();
            }
        }

        scanner.close();


        if (grade <= 100 && grade >= 90) {
            System.out.println("The grade this student has gotten is: A");
        } else if (grade <= 89 && grade >= 80) {
            System.out.println("The grade this student has gotten is: B");
        } else if (grade <= 79 && grade >= 70) {
            System.out.println("The grade this student has gotten is: C");
        } else if (grade <= 69 && grade >= 60) {
            System.out.println("The grade this student has gotten is: D");
        } else {
            System.out.println("The grade this student has gotten is: F");
        }

    }
}
