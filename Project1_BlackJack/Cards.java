package Project1_BlackJack;

public class Cards {

    // ========Cards class==========
    // Purpose ==  Cards class holds the cards for the entire game. Shuffle will only execute after game ends
    // Object == Cards class will use an ArrayList object for it's returned values
    // Cards() - constructor. Initializes a full deck of cards each time the class is made
    // drawCards(int i) decrements the given number of cards in the deck and returns them
    // shuffle(Cards playercards, Cards dealercards) adds back all cards from player and house and shuffles them. MUST REMOVE CARDS FROM PLAYERS AND HOUSE BEFORE SHUFFLE
    // showCards(Cards playercards, Cards dealerCards) takes in cards object from player and Dealer and returns what is had
    // =======================

     private String suit;
     public String value;

    public Cards(String suit, String value){
        this.suit = suit;
        this.value = value;
    }

    public String toString(){
        return value + " - " + suit;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String cardSuit) {
        this.suit = suit;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String val) {
        this.value = val;
    }

    public int getRealVal(){

        return switch (this.value.toLowerCase()) {
            case "ace" -> 11;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10", "jack", "queen", "king" -> 10;
            default -> 0;
        };
    }
}
