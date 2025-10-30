public class GameSession {
    private String word;
    // set other variables like a map, counter, etc
    private int guesses;
    private boolean gameState;

    GameSession(String s, int count) {
        this.word = s;
        this.guesses = count;
        this.gameState = true;
    }

    public String getWord() {
        return word;
    }

    public void decrementGuesses() {
        guesses--;
    }

    public boolean getGameState(){
        return gameState;
    }

    public void setGameState(boolean state){
        this.gameState = state;
    }

    public int getGuesses() {
        return guesses;
    }
}
