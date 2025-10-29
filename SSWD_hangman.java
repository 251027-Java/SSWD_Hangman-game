import java.nio.file.FileSystemNotFoundException;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

import static java.lang.System.exit;

class SSWD_Hangman{

   static GameSession hangman;
   static Set<Character> mainWord = new HashSet<>();
   static Set<Character> workingWord = new HashSet<>();

    public String guessWord(String userIn){
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

    public static boolean guessALetter(char c) {

        if (!mainWord.contains(c)) {
            hangman.decrementGuesses();
            System.out.println("Wrong guess!");
            return false;
        }

        workingWord.add(c);
        if (mainWord.equals(workingWord))
            System.out.println("You Win!");

        displayGameState();
        return true;
    }

    public static void main(String[] args){
        hangman = new GameSession("hangman", 6);
        setMainWordSet(hangman.getWord());
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

    public static void displayGameState() {
        String word = hangman.getWord();
        for (int i = 0; i < word.length(); i++) {
            if (workingWord.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
                continue;
            }
            System.out.print("_");
        }
        System.out.println();
    }

    private static void setMainWordSet(String word) {
        System.out.println("Current status");
        for (int i = 0; i < word.length(); i++) {
            mainWord.add(word.charAt(i));
        }
    }
}