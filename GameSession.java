import java.util.Scanner;

public class GameSession {
    private String word;
    // set other variables like a map, counter, etc
    private int guesses;
    private boolean gameState;

    public GameSession(String s, int count) {
        this.word = s;
        this.guesses = count;
        this.gameState = true;
    }

    public String getWord() {
        return word;
    }

    public String getUserGameChoice(){

        System.out.println("Do you now wish to guess a letter or word?");
        Scanner scanin = new Scanner(System.in);
        String userAnswer = scanin.nextLine().toLowerCase();

        while(!userAnswer.equalsIgnoreCase("letter") && !userAnswer.equalsIgnoreCase("word")){

            System.out.println("You did not enter 'word' or 'letter'. please enter one");
            userAnswer = scanin.nextLine().toLowerCase();
        }

        return userAnswer;

    }

    public void decrementGuesses() {
        guesses--;
    }

    public boolean getGameState() {
        return gameState;
    }

    public void setGameState(boolean state) {
        this.gameState = state;
    }

    public int getGuesses() {
        return guesses;
    }

    public void getHangView(int guesses) {


        switch (guesses) {
            case 6:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 5:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 4:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println("  |   |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 3:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 2:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println("      |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 1:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" /   |");
                System.out.println("      |");
                System.out.println("=========");
                break;
            case 0:
                System.out.println("  +---+");
                System.out.println("  |   |");
                System.out.println("  O   |");
                System.out.println(" /|\\  |");
                System.out.println(" / \\ |");
                System.out.println("      |");
                System.out.println("=========");
                break;


        }
    }
}
