package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



/**
 * A class that retrieves a number from the user.
 */
public class NumberGetter {


    /**
     * Reads an integer from the user.
     *
     * @param message The message to display before reading the input.
     * @return The integer entered by the user.
     * @throws RuntimeException if there is a problem reading from the user.
     */
    public int getNumber(String message){
        int numPlayers = 0;
        try {
            System.out.print(message);
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            boolean exit = false;
            while (!exit) {
                String n = bf.readLine();
                try {
                    numPlayers = Integer.parseInt(n);
                    exit = true;
                } catch (RuntimeException ex) {
                    throw new RuntimeException(ex);
                }
            }

        } catch (IOException ex) {
            throw new RuntimeException("There was a problem reading from the user");
        }
        return numPlayers;
    }
    
}
