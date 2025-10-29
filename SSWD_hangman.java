import java.nio.file.FileSystemNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class SSWD_Hangman{

   static GameSession hangman;
   static Set<Character> mainWord = new HashSet<>();
   static Set<Character> workingWord = new HashSet<>();

    public String guessWord(String userIn){

        return "";
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