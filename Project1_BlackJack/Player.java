package Project1_BlackJack;

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
    private int balance;
    //Bet money
    private int currentBet;
    //player cards amount
    private String[] cards;

    //Making a new player
    public Player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much of YOUR HARD EARNED money are willing to Gamble?: ");
        this.balance = scanner.nextInt();
        this.currentBet = 0;          // No bet yet
        this.cards = new String[0];   // No cards yet
    }

    //Get the player's cards
    public String[] getCards() {
        return cards;
    }

    //Set the player's cards
    public void setCards(String[] newCards) {
        cards = newCards;
    }

    //Get the next action from the player
    public String getNextPlayerAction() {
        Scanner scanner = new Scanner(System.in);
        String action = "";

        // Make the player type either "hit" or "stand"
        while (!action.equals("hit") && !action.equals("stand")) {
            System.out.print("hit or stand: ");
            action = scanner.nextLine().toLowerCase();

            if (!action.equals("hit") && !action.equals("stand")) {
                System.out.println("That word is not one of the options given to you. Try again. Type 'hit' or 'stand'.");
            }
        }

        return action;
    }

    // Get the player's bet
    public int getBet() {
        return currentBet;
    }

    // Set the player's bet
    public void setBet(int betAmount) {
        currentBet = betAmount;
    }

    // Get the player's balance
    public int getBalance() {
        return balance;
    }

    // Set the player's balance
    public void setBalance(int newBalance) {
        balance = newBalance;
    }
}
