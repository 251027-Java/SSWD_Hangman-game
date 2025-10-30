package Project1_BlackJack;

public class BlackJack_utils {

    // Fields
    // Cards
    // Player Balance
    // House Balance
    // Current bet from Player

    // Methods
    // getCards
    // getPlayerBalance
    // getHouseBalance
    // getGameState
    //

    // setCards
    // setPlayerBalance
    // setHouseBalance
    // setGameState


    // ========Cards class==========
    // Purpose ==  Cards class holds the cards for the entire game. Shuffle will only execute after game ends
    // Cards() - constructor
    // drawCards(int i) decrements the given number of cards in the deck and returns them
    // shuffle(Cards playercards, Cards dealercards) adds back all cards from player and house and shuffles them
    // showCards(Cards playercards, Cards dealerCards) takes in cards object from player and Dealer and returns what is had
    // =======================

    // ==========Player class===========
    // Purpose == Class that sets, gets the state of the players actions and cards through the game
    // Player() - constructor
    // getCards() - Gets the cards the player has
    // getNextPlayerAction() - Gets the next player action. Only accepts: ['hit', 'stand', 'double'] for now
    // getBet() - Get player bet
    // getBalance() - Get player balance
    // setBet() - Sets the Players current bet
    // setBalance - Sets the players current balance
    // =========================================

    // =================House class===================
    // Equal to player class
    // ==================================================

    // =================GameState class==================
    // Purpose == Watches the state of the game
    // gameState() - constructor starts game
    // getGameState()
    // setGameState()
    // =====================================================
}
