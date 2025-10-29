import java.io.DataInputStream;
import java.io.IOException;

public class Grader {


    public static void main(String[] args)
        throws IOException
    {

        // Check values to make sure it is not less than 0 or more than 100


        DataInputStream r = new DataInputStream(System.in);

        // Reading double

        double userNum = -1;

        while(userNum < 0 || userNum > 100) {

            System.out.print("Enter a number: ");
            String userInput = r.readLine();
            userNum = Double.parseDouble(userInput);

            if(userNum < 0 || userNum > 100){
                System.out.println("value entered is invalid. Please make sure your number is in the range of 0 and 100");
            }
        }

        if(userNum <= 100 && userNum >= 90){
            System.out.println("The grade this student has gotten is: A");
        }else if (userNum <= 89 && userNum >= 80){
            System.out.println("The grade this student has gotten is: B");
        }else if (userNum <= 79 && userNum >= 70){
            System.out.println("The grade this student has gotten is: C");
        }else if (userNum <= 69 && userNum >= 60){
            System.out.println("The grade this student has gotten is: D");
        }else{
            System.out.println("The grade this student has gotten is: F");
        }

    }
}
