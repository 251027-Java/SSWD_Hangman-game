package Project1_BlackJack;

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

    public void setCards(ArrayList<Cards> newCards) {this.cards = newCards;}

    public Cards revealVisibleCard(){
        return cards.getFirst();
    }

}
