import java.util.Locale;
import java.util.Scanner;

class SSWD_Hangman{

    public String guessWord(String userIn){

        return "";
    }

    public String guessALetter(char c) {
        return "hello";
    }

    public static void main(String[] args){

        String mainWordArray = "";
        String workingWordArray ="";

        Scanner scanin = new Scanner(System.in);
        int tryCount = 0;

        IO.println("Do you want to guess a letter or word?");
        String answer = scanin.nextLine().toLowerCase();


        if (answer.equalsIgnoreCase("word")){
            IO.println("hey");
        } else if (answer.equalsIgnoreCase("letter")){
            IO.println("letter letter");
        } else {
            IO.println("Invalid. Answer with either 'word' or 'letter'.");
            scanin.nextLine();
        }




    }
}