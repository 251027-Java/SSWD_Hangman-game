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
        boolean valid = true;

        IO.println("Do you want to guess a letter or word?");
        String answer = scanin.nextLine().toLowerCase();

        while(valid){
            if (answer.equalsIgnoreCase("word")){
                IO.println("You can now guess your word");
                String word = scanin.nextLine().toLowerCase();
                guessWord(word);
                valid = false;
            } else if (answer.equalsIgnoreCase("letter")){
                IO.println("You can now guess a letter");
                String letter = scanin.nextLine().toLowerCase();
                guessALetter(letter);
                valid = false;
            } else {
                IO.println("Invalid. Answer with either 'word' or 'letter'.");
                scanin.nextLine();
            }
        }





    }
}