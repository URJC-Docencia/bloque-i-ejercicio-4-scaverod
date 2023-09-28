package bingo;

import utils.NumberGetter;

/**
 * The Game class represents a game of bingo.
 * It manages the players and the gameplay.
 */
class Game {


    private final LotteryDrum lotteryDrum;
    private Player[] players;

    /**
     * Creates a new instance of the Game class.
     * <p>
     * This constructor initializes a new object of the Game class. It creates a new instance of the Hype class and calls the
     * createPlayers() method to set up the players for the game.
     */
    public Game() {
        lotteryDrum = new LotteryDrum();
        createPlayers();
    }


    /**
     * Plays the game.
     * <p>
     * This method is responsible for playing the game. It iteratively takes numbers from the Hype object and removes them
     * from the players' cards until there are no more numbers left. It checks for line and bingo conditions for each player,
     * and prints appropriate messages when a line or bingo is detected.
     */
    void play() {
        boolean lineDetected = false;
        while (lotteryDrum.hasNumbers()) {
            int number = lotteryDrum.getNumber();
            for (int i = 0; i < players.length; i++) {
                players[i].removeNumber(number);
                if (!lineDetected) {
                    if (players[i].hasLine()) {
                        System.out.println("Line detected");
                        lineDetected = true;
                    }
                }
                if (players[i].hasBingo()) {
                    System.out.println("Bingo detected");
                    break;
                }

            }
        }

    }

    /**
     * Creates the players for the game.
     * <p>
     * This method is responsible for creating the players for the game. It prompts the user for the number of players,
     * creates an array of Player objects with the specified number, and initializes each player with a new Player object.
     */
    private void createPlayers() {
        NumberGetter n = new NumberGetter();
        final int numPlayers = n.getNumber("Number of players:");
        players = new Player[numPlayers];
        for (int i = 0; i < numPlayers; i++) {
            players[i] = new Player();
        }

    }


}
