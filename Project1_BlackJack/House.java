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
        this.cards = cards;
    }

    public ArrayList<Cards> getCards() {return this.cards;}

    public void setCards(ArrayList<Cards> newCards) {this.cards = newCards;}

    public String revealVisibleCard(){
        //String temp = cards[0].getValue();
        List list = cards;
        Cards c = list.get(0);
        return c.getValue();
    }

}
