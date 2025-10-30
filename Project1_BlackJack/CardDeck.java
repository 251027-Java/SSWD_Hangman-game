package Project1_BlackJack;

import java.util.ArrayList;

public class CardDeck {

    private ArrayList<Cards> cards;

    public CardDeck(){
        this.cards = new ArrayList<Cards>();
    }

    public void createDeck(){
        for(CardSuit cardSuit : CardSuit.values()){
            for(CardValue cardVal : CardValue.values()){
                this.cards.add(new Cards(cardSuit, cardVal));
            }
        }
    }



}
