package Project1_BlackJack;

import java.util.ArrayList;
import java.util.Collections;

public class CardDeck {

    private ArrayList<Cards> gameDeck;

    public CardDeck(){
        this.gameDeck = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};
        String[] values = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        // This will generate our deck of 52
        for(String cardSuit : suits){
            for(String cardVal : values){
                gameDeck.add(new Cards(cardSuit,cardVal));
            }
        }
    }

    public void shuffleDeck(){
        Collections.shuffle(gameDeck);
    }

    public Cards drawCard(){
        if(!gameDeck.isEmpty()){
            return gameDeck.remove(0);
        } else {
            return null;
        }
    }

    public int deckSize(){
        return gameDeck.size();
    }

    public void displayDeck(){
        for(Cards card : gameDeck){
            System.out.println(card);
        }
    }




}
