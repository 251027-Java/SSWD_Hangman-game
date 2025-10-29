import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.exit;

class SSWD_Hangman{

    public Boolean guessWord(String userIn, String mainWord, GameSession game){

        // Compare the words together
        //

        // If gained word is correct
        // Exit game
        // Else, return false.
        if(userIn == mainWord) {
            System.out.println("You won!");
            System.exit(0);
            return true;
        }else{
            System.out.println("Oh...you guessed wrong");
            game.guesses -= 1;
            return false;
        }
    }

    public String guessALetter(char c) {
        return "hello";
    }

    public static void main(String[] args){
        GameSession hangman = new GameSession("hangman", 6);

        String mainWordArray = "";
        String workingWordArray ="";

        Scanner scanin = new Scanner(System.in);
        int tryCount = 0;
        boolean valid = true;

        System.out.println("Do you want to guess a letter or word?");
        String answer = scanin.nextLine().toLowerCase();

        while(valid){
            if (answer.equalsIgnoreCase("word")){
                System.out.println("You can now guess your word");
                String word = scanin.nextLine().toLowerCase();
                guessWord(word);
                valid = false;
            } else if (answer.equalsIgnoreCase("letter")){
                System.out.println("You can now guess a letter");
                String letter = scanin.nextLine().toLowerCase();
                guessALetter(letter);
                valid = false;
            } else {
                System.out.println("Invalid. Answer with either 'word' or 'letter'.");
                scanin.nextLine();
            }
        }





    }
}