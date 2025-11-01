package Project1_BlackJack;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class House {

    // =================House class===================
    // Equal to player class
    // ==================================================

    private int balance;
    private ArrayList<Cards> cards = new ArrayList<>();


    public House() {
        this.balance = 1000;
    }

    public ArrayList<Cards> getCards() {return this.cards;}

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int num){
        this.balance = num;
    }

    public void addCard(Cards newCard) {

        this.cards.add(newCard);
    }

    public void removecards(){
        this.cards = new ArrayList<Cards>();
    }

    public Cards revealVisibleCard(){
        return cards.getFirst();
    }

    public int getCardSum(){

        int sum = 0;
        for(Cards card: this.cards){
            sum += card.getRealVal();
        }

        return sum;
    }

    public int getFinalCardSum() {
        int sum = 0;
        int aceCount = 0;

        for (Cards card : this.cards) {
            int val = card.getRealVal();
            sum += val;
            if (card.getValue().equalsIgnoreCase("Ace")) {
                aceCount++;
            }
        }

        // Personal note: if there is something to track, always count that thing to track. Makes it easier to exit condition
        while (sum > 21 && aceCount > 0) {
            sum -= 10;
            aceCount--;
        }

        return sum;
    }

}
