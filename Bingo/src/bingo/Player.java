package bingo;

import utils.NumberGetter;

/**
 * This class represents a player in a bingo game.
 */
class Player {



    private Card[] cards;

    /**
     * Instantiates a new Player object.
     *
     * When a new Player object is created, it prompts the user to enter the number of cards the player will have.
     * It then creates a new array of Card objects with the given number of cards, and initializes each card with a default value.
     */
    public Player() {
        NumberGetter n = new NumberGetter();
        int numCards = n.getNumber("Number of cards:");
        cards = new Card[numCards];
        for (int i = 0; i < numCards; i++) {
            cards[i] = new Card();
        }
    }

    /**
     * Removes the given number from the Player's hand.
     *
     * This method removes the specified number from the Player's hand of cards. If the number is not found in the hand,
     * the method does nothing. If the hand is empty, the method also does nothing.
     *
     * @param number the number to be removed from the Player's hand
     */
    void removeNumber(int number) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Checks if the Player has a line in their hand.
     *
     * @return true if the Player has a line of matching numbers in their hand, false otherwise
     */
    boolean hasLine() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * Checks if the Player has a bingo in their hand.
     *
     * @return true if the Player has a bingo in their hand, false otherwise
     */
    boolean hasBingo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
