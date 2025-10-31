package Project1_BlackJack;

import java.util.Scanner;

public class gameState {

    // =================GameState class==================
    // Purpose == Watches the state of the game
    // gameState() - constructor starts game
    // getGameState() - gets the current state of the game
    // setGameState() - sets the state of the game
    // start() - Starts the game
    // =====================================================

    // Player playerName = new Player()
    // House house = new House()
    // Cards cards = new Cards()

    // ============constructor================
    // Constructor of gameState()
    // "How much do you wish to bet?"
    // Player.setBet() = givenBet
    // House.setBalance() = givenBalance
    // Player.setCards(cards.drawCards())
    // House.setCards(cards.drawCards())
    // ==========================================


    private Player playername = new Player();
    //private House house = new House();
    private CardDeck deck = new CardDeck();
    Scanner scanin = new Scanner(System.in);


    public gameState(){


    }



    public void start(){

        // Player class sets balance
        // Next, set bet

        System.out.println("Welcome to the game!");
        System.out.println("How much of a bet do you wish to place for this game?");
        int playerBet = scanin.nextInt();

        playername.setBet(playerBet);

        // Shuffle deck of cards
        deck.shuffleDeck();

        // Give 2 cards to player
        playername.setCards(deck.drawCard());
        playername.setCards(deck.drawCard());

        // give 2 cards to dealer
        //house.setcards(deck.drawCard());
        //house.setcards(deck.drawCard());


        // Show cards of player
            // TODO: implement a view for the cards


        // Show one visible card for dealer
            // TODO: show dealers visible card and a hidden one

        // request from user whether they wish to hit, stand or double
        String action = playername.getNextPlayerAction();

        // if stand,

        if (action.equalsIgnoreCase("stand")){

            //      get dealer cards revealed
            //          dealer hits their own deck if their number is 16 or lower
            //      get player cards revealed
            //      and see who has the higher number
            //      win or lose condition (includes ask again if they wish to play again).

            System.out.println("stand");

        }else if (action.equalsIgnoreCase("hit")){
            System.out.println("hit");
        }else if (action.equalsIgnoreCase("Double")){
            System.out.println("Double");
        }else{
            System.out.println("Wrong. Please select either hit, stand, or double");
        }

        // if hit,
        //      check if the user has 21 or is above. If not, allow them to hit again
        //          prompt if he wants to hit again, if yes, add another card to his deck
        // if double, check if the user had 21 or is above.
        //      same as hit, but only once and doubles the bet




        // end conditions
        // Players cards go higher than 21
        // Players cards equal 21
        // Players balance equals 0
        // Players
    }

}
