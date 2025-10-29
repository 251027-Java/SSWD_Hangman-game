public class GameSession {
    String word;
    // set other variables like a map, counter, etc
    int guesses;

    GameSession(String s, int count) {
        this.word = s;
        int guesses = count;
    }

    public String getWord() {
        return word;
    }

    public int getGuesses() {
        return guesses;
    }
}
