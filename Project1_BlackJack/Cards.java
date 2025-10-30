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

     private CardSuit myCardSuit;
     private CardValue myCardValue;

    public Cards(CardSuit cardSuit, CardValue cardValue){
        myCardValue = cardValue;
        myCardSuit = cardSuit;
    }

    public String toString(){
        return myCardSuit.toString() + "-" + myCardValue.toString();
    }

    public CardSuit getMySuit() {
        return myCardSuit;
    }

    public void setMySuit(CardSuit cardSuit) {
        myCardSuit = cardSuit;
    }

    public CardValue getMyValue() {
        return myCardValue;
    }

    public void setMyValue(CardValue val) {
        myCardValue = val;
    }
}
