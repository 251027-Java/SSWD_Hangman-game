package Project1_BlackJack;

public class BlackJack {


    public static void main(String args[]) {

        // gameState game = new gameState()
        // game.start()


        // Testing card deck
        CardDeck cd = new CardDeck();

        System.out.println("Deck in order :");
        cd.displayDeck();

        System.out.println("\nDeck shuffled :");
        cd.shuffleDeck();
        cd.displayDeck();

        System.out.println("\nDrawing top 3 cards :");
        System.out.println(cd.drawCard());
        System.out.println(cd.drawCard());
        System.out.println(cd.drawCard());


    }
}