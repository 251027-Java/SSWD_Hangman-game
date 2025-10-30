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


    public static Boolean guessWord(String userIn) {
        // Compare the words together
        //
        //System.out.println("Guess word reached here");
        // If gained word is correct
        // Exit game
        // Else, return false.
        if (userIn.equalsIgnoreCase(hangman.getWord())) {

            System.out.println("Correct!");
            displayGameState();
            hangman.getHangView(hangman.getGuesses());
            hangman.setGameState(false);
            System.exit(0);
            return true;
        } else {
            hangman.decrementGuesses();
            System.out.println("Oh...you guessed wrong");
            System.out.println("You have: " + hangman.getGuesses() + " Guesses left");
            hangman.getHangView(hangman.getGuesses());
            displayGameState();
            return false;
        }
    }

    public static boolean guessALetter(char c) {


        if (!mainWord.contains(c)) {
            hangman.decrementGuesses();
            hangman.getHangView(hangman.getGuesses());
            displayGameState();
            System.out.println("Wrong guess!");
            System.out.println("You have: " + hangman.getGuesses() + " Guesses left");
            return false;
        }


        workingWord.add(c);
        if (mainWord.equals(workingWord)) {
            System.out.println("You Win!");
            hangman.getHangView(hangman.getGuesses());
            displayGameState();
            System.exit(0);
        }
        hangman.getHangView(hangman.getGuesses());
        displayGameState();
        return true;
    }

    public static void main(String[] args){



        hangman = new GameSession("cognizant", 6);
        setMainWordSet(hangman.getWord());
        String mainWordArray = "";
        String workingWordArray ="";

        Scanner scanin = new Scanner(System.in);
        int tryCount = 0;
        boolean valid = true;

        System.out.println("Do you want to guess a letter or word?");
        String answer = scanin.nextLine().toLowerCase();
        hangman.getHangView(hangman.getGuesses());
        displayGameState();


        while(hangman.getGameState()){

            if (answer.equalsIgnoreCase("word")){
                System.out.println("You can now guess your word");
                String word = scanin.nextLine().toLowerCase();
                guessWord(word);
            } else if (answer.equalsIgnoreCase("letter")){
                System.out.println("You can now guess a letter");
                Character letter = scanin.next().charAt(0);
                scanin.nextLine();
                guessALetter(letter);
            } else {
                System.out.println("Invalid. Answer with either 'word' or 'letter'.");
                scanin.nextLine();
            }

            if(hangman.getGuesses() == 0){
                hangman.getHangView(hangman.getGuesses());
                System.out.println("Oh no! He's dead!");
                hangman.setGameState(false);
            }

            answer = hangman.getUserGameChoice();
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
        for (int i = 0; i < word.length(); i++) {
            mainWord.add(word.charAt(i));
        }
    }
}
