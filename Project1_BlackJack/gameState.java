package Project1_BlackJack;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

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


    private Player playername ;
    private House house;
    private CardDeck deck;
    Scanner scanin = new Scanner(System.in);


    public gameState(Player playername, House house, CardDeck deck){
        this.playername = playername;
        this.house = house;
        this.deck = deck;

    }



    public void start(){

        // Player class sets balance
        // Next, set bet
        System.out.println("How much of a bet do you wish to place for this game?");


        //playername.setBet(playerBet);
        int playerBet = scanin.nextInt();

        do{
            try {


                if (playerBet > playername.getBalance()){
                    System.out.println("Amount you entered is greater than the balance. Please place a valid bet.");
                    playerBet = scanin.nextInt();
                }else if(playerBet > house.getBalance()){
                    System.out.println("Sorry, but you can't bet more than the house has in balance. Please place a valid bet.");
                }
            } catch (Exception e){
                System.out.println("You did not enter a valid input. Please enter a number greater than 10");
                scanin.next();
            }
        }while(playerBet > playername.getBalance() && !(playerBet > house.getBalance()));
        playername.setBet(playerBet);

        // Shuffle deck of cards
        deck.shuffleDeck();

        // Give 2 cards to player
        playername.addCard(deck.drawCard());
        playername.addCard(deck.drawCard());

        // give 2 cards to dealer
        house.addCard(deck.drawCard());
        house.addCard(deck.drawCard());

        if(playername.getFinalCardSum() == 21){
            System.out.println("Players cards are: " + playername.getCards());
            System.out.println("Player has BLACKJACK");
            System.out.println("Player has won!");
            playername.setBalance(playername.getBalance() + playername.getBet());
            house.setBalance(house.getBalance() - playername.getBet());
            return;
        }


        // Show cards of player
            // TODO: implement a view for the cards

        System.out.println("This is the players cards: " + playername.getCards());


        // Show one visible card for dealer
            // TODO: show dealers visible card and a hidden one

        System.out.println("These are the visible house cards: " + house.revealVisibleCard());
        // System.out.println("These are the house's full cards: " + house.getCards());

        // request from user whether they wish to hit, stand or double
        String action = playername.getNextPlayerAction();

        do{
            if((playername.getBalance() < (playername.getBet()*2)) && action.equalsIgnoreCase("double")){
                System.out.println("You do not have enough in balance to double your bet. Please select another option");
                action = playername.getNextPlayerAction();
            }
        }while((playername.getBalance() < (playername.getBet()*2)) && action.equalsIgnoreCase("double"));


        if (action.equalsIgnoreCase("stand")){

            this.stand(house, deck, playername);

        }else if (action.equalsIgnoreCase("hit")){
                this.hit(house, deck, playername);

        }else if (action.equalsIgnoreCase("Double")){
            this.Double(house, deck, playername);
        }

    }

    private void hit(House house, CardDeck deck, Player player){
        // If hit
        // add card to deck. Check if total is above or equal to 21
        // if not, request if they want to hit again. if not, end function

        Scanner scanner = new Scanner(System.in);
        String action = "";

        player.addCard(deck.drawCard());
        System.out.println("\nPlayer has hit. New cards: " + player.getCards());
        System.out.println("New player total: " + player.getFinalCardSum());

        if(player.getFinalCardSum() < 21) {
            do {

                if (player.getFinalCardSum() > 21) {
                     break;
                }

                if (action.equalsIgnoreCase("y") && (playername.getCardSum() < 21)) {
                    player.addCard(deck.drawCard());
                    System.out.println("\nPlayer has hit. New cards: " + player.getCards());
                    System.out.println("New player total: " + player.getFinalCardSum());
                    System.out.println("\n The visible house cards: " + house.revealVisibleCard());
                    System.out.println("The house total is: " + house.getFinalCardSum());
                }

                System.out.println("Do you wish to hit again? Write Y to hit or write N to stand");

                // Make the player type either "hit" or "stand"
                while (!action.equalsIgnoreCase("N") && !action.equalsIgnoreCase("Y")) {
                    action = scanner.nextLine().toLowerCase();

                    if (!action.equalsIgnoreCase("y") && !action.equalsIgnoreCase("n")) {
                        System.out.println("That is not one of the options given to you. Try again. Type 'y' or 'n'.");
                    }

                }

            } while (player.getFinalCardSum() < 21 && !action.equalsIgnoreCase("n"));
        }

        this.stand(house, deck, player);

    }

    private void Double(House house, CardDeck deck, Player player){

        player.addCard(deck.drawCard());
        player.setBet(player.getBet() * 2);
        System.out.println("\nPlayer has dobuled. New cards: " + player.getCards());
        System.out.println("New player bet: " + player.getBet());
        System.out.println("New player Card total: " + player.getFinalCardSum());

        this.stand(house, deck, player);
    }

    private void stand(House house, CardDeck deck, Player playername){


        // Check if player is over 21

        if(playername.getFinalCardSum() > 21){
            System.out.println("\nOh no...player has gone bust. The House won!");
            playername.setBalance(playername.getBalance() - playername.getBet());
            house.setBalance(house.getBalance() + playername.getBet());
            System.out.println("Player has lost: " + playername.getBet() + " in bet.");
            return;
        }

        if(!(house.getFinalCardSum() > 21) && !(playername.getFinalCardSum() > 21)){

            //      get dealer cards revealed
            System.out.println("The cards for the house are: " + house.getCards());


            //          dealer hits their own deck if their number is 16 or lower
            if(house.getFinalCardSum() <= 16){
                do{
                    System.out.println("\nHouse total is less than 17.");
                    System.out.println("Adding cards......");
                    house.addCard(deck.drawCard());

                    try {
                        TimeUnit.SECONDS.sleep(3);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                    System.out.println("\nHouse cards now are: " + house.getCards());
                    System.out.println("House sum is now: " + house.getFinalCardSum());
                }while(house.getFinalCardSum()<=16);
            }


            System.out.println("House total is: " + house.getFinalCardSum());

            if(house.getFinalCardSum() > 21){
                System.out.println("House has gone bust. Player has won!");
                playername.setBalance(playername.getBalance() + playername.getBet());
                house.setBalance(house.getBalance() - playername.getBet());
                System.out.println("Player has gained: " + playername.getBet() + " in bet.");
                return;
            }else{
                this.getWinner(house, playername);
            }

        }else if(house.getFinalCardSum() > 21){
            System.out.println("House has gone bust, player has won!");
            playername.setBalance(playername.getBalance() + playername.getBet());
            house.setBalance(house.getBalance() - playername.getBet());
            System.out.println("Player has gained: " + playername.getBet() + " in bet.");
            return;
        }
    }

    // If true, player has won, if false, house has won. returns null if push
    public void getWinner(House house, Player playername){


        // Condition: neither house nor player are higher than 21 to reach this function


        if(house.getFinalCardSum() > playername.getFinalCardSum()){                                 // If house wins
            System.out.println("Oh no...the House won!");
            playername.setBalance(playername.getBalance() - playername.getBet());
            house.setBalance(house.getBalance() + playername.getBet());
            System.out.println("Player has lost: " + playername.getBet() + " in bet.");
        }

        else if (house.getFinalCardSum() < playername.getFinalCardSum()){                           // If player wins
            System.out.println("YES. Player has won!");
            playername.setBalance(playername.getBalance() + playername.getBet());
            house.setBalance(house.getBalance() - playername.getBet());
            System.out.println("Player has gained: " + playername.getBet() + " in bet.");

        }else if (house.getFinalCardSum() == playername.getFinalCardSum()){                        // If player and house tied
            System.out.println("Push. House and Player are tied");


        }else if (playername.getFinalCardSum() == 21){                                              // If player has a blackjack.
            System.out.println("Player has BLACKJACK");
            System.out.println("Player has won!");
            playername.setBalance(playername.getBalance() + playername.getBet());
            house.setBalance(house.getBalance() - playername.getBet());
        }

        return;



    }

    public void gameReset(House house, Player playername, CardDeck deck){

        deck.resetDeck();
        playername.removecards();
        house.removecards();
    }

}
