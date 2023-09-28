package bingo;

/**
 * The Bingo class represents the main class that runs the Bingo game.
 * It contains the main method for starting the game.
 */
public class Bingo {


    /**
     * The main method is the entry point for the Java application.
     * It creates an instance of the Game class and starts the game by invoking the play method.
     *
     * @param args the command line arguments passed to the application
     */
    public static void main(String[] args) {
        Game p = new Game();
        p.play();
    }
    
}
