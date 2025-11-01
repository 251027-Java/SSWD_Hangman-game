package Project1_BlackJack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    // ==========Player class===========
    // Purpose == Class that sets, gets the state of the players actions and cards through the game
    // Player() - constructor
    // getCards() - Gets the cards the player has along with the number their cards adds too.
    //arrayList
    // getNextPlayerAction() - Gets the next player action. Only accepts: ['hit', 'stand', 'double'] for now
    //scanner
    // getBet() - Get player bet
    // getBalance() - Get player balance
    // setBet() - Sets the Players current bet
    // setBalance - Sets the players current balance
    // =========================================

    // Fields
    //Player money
    private int balance = 0;
    //Bet money
    private int currentBet;
    //player cards amount
    public ArrayList<Cards> cards = new ArrayList<>();

    //Making a new player
    public Player() {
        Scanner scanner = new Scanner(System.in);

        // Adds balance to players bank for the rest of the game
        System.out.print("How much money do you wish to add to your balance?");
        while(this.balance < 10) {
            try {
                this.balance = scanner.nextInt();

                if (this.balance < 10){
                    System.out.println("You must enter an amount greater than 10 to play");
                }
            } catch (Exception e){
                    System.out.println("You did not enter a valid input. Please enter a number greater than 10");
                    scanner.next();
            }
        }
        this.currentBet = 0;          // No bet yet
        this.cards = cards;   // No cards yet
    }

    //Get the player's cards
    public ArrayList<Cards> getCards() {
        return this.cards;
    }

    //Set the player's cards
    public void addCard(Cards newCard) {

        this.cards.add(newCard);
    }

    public void removecards(){
        this.cards = new ArrayList<Cards>();
    }

    //Get the next action from the player
    public String getNextPlayerAction() {
        Scanner scanner = new Scanner(System.in);
        String action = "";

        // Make the player type either "hit" or "stand"
        while (!action.equalsIgnoreCase("hit") && !action.equalsIgnoreCase("stand") && !action.equalsIgnoreCase("Double")) {
            System.out.print("Enter either hit, stand, Double: ");
            action = scanner.nextLine().toLowerCase();

            if (!action.equalsIgnoreCase("hit") && !action.equalsIgnoreCase("stand") && !action.equalsIgnoreCase("Double")) {
                System.out.println("That word is not one of the options given to you. Try again. Type 'hit', 'stand', or 'double'.");
            }
        }

        return action;
    }

    public int getCardSum(){

        int sum = 0;
        for(Cards card: this.cards){
            sum += card.getRealVal();
        }

        return sum;
    }


    // Meant to get final card sum. Final sum. Includes changes for ace cards from 11 to 1 and vice versa
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

    // Get the player's bet
    public int getBet() {
        return this.currentBet;
    }

    // Set the player's bet
    public void setBet(int betAmount) {
        this.currentBet = betAmount;
    }

    // Get the player's balance
    public int getBalance() {
        return this.balance;
    }

    // Set the player's balance
    public void setBalance(int newBalance) {
        this.balance = newBalance;
    }
}
