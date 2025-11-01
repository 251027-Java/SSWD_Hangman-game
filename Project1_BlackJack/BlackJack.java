package Project1_BlackJack;

import java.util.Scanner;

public class BlackJack {


    public static void main(String args[]) {

        System.out.println("Welcome to the game!");
        String playAgain = "";
        Player playerName = new Player();
        House house = new House();
        CardDeck deck = new CardDeck();
        gameState game = new gameState(playerName, house, deck);
        Scanner scanin = new Scanner(System.in);

        do {
            game.start();

            System.out.println("Nice game!");
            System.out.println("House balance: " + house.getBalance());
            System.out.println("Player balance: " + playerName.getBalance());


            if(playerName.getBalance() == 0){
                System.out.println("Sorry friend, you're allll out of money");
                System.out.println("goodbye!");
                break;
            }else if(house.getBalance() == 0){
                System.out.println("Whoa! You took all the house has!");
                System.out.println("Well done!");
                break;
            }

            System.out.println("Do you wish to play again? Y or N?");
            playAgain = scanin.nextLine().toLowerCase();

            // Make the player type either "hit" or "stand"
            while (!playAgain.equalsIgnoreCase("y") && !playAgain.equalsIgnoreCase("n")) {


                if (!playAgain.equalsIgnoreCase("y") && !playAgain.equalsIgnoreCase("n")) {
                    System.out.println("What you entered is not one of the options given to you. Try again. Type 'n' or 'y'.");
                    playAgain = scanin.nextLine().toLowerCase();
                }
            }

            if(playAgain.equalsIgnoreCase("n")){
                break;
            }else if (playAgain.equalsIgnoreCase("y")) {
                game.gameReset(house, playerName, deck);
            }


        }while(!playAgain.equalsIgnoreCase("n"));


        System.out.println("Thanks for playing!");

    }
}

// Testing pull
