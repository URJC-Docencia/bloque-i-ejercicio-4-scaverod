package bingo;


import utils.ListGeneration;

import java.util.ArrayList;

/**
 * Represents a lottery drum that contains numbers for a lottery game.
 */
class LotteryDrum {


    private ArrayList<Integer> numbers;

    /**
     * Constructs a new instance of the LotteryDrum class.
     *
     * ¿Qué tiene que cumplir?
     *  - Los elementos no pueden estar repetidos
     *  - Si sacas un número ya no puede volver a salir
     *  - Los número salen aleatoriamente
     *
     * ¿Qué operaciones voy a utilizar?
     *  - Sacar un elemento.
     *       - No puede haber salido antes
     *       - La elección tiene que ser aleatoria
     */
    public LotteryDrum() {
        numbers = ListGeneration.generateUnsortedListOfNumbers(1,90);
    }

    /**
     * Returns whether the LotteryDrum object has any numbers or not.
     *
     * @return true if the LotteryDrum has numbers, false otherwise.
     */
    boolean hasNumbers() {
        return !numbers.isEmpty();
    }

    /**
     * Returns a random number from the LotteryDrum object.
     *
     * @return the randomly generated number.
     */
    int getNumber() {
        return numbers.remove(0);
    }
    
    
    /**
     * Returns a string representation of the LotteryDrum object.
     *
     * The string is formatted as follows:
     *  - The first line contains the text "Lottery drum".
     *  - The second line contains the text "Numbers left: " followed by the number of numbers left in the drum.
     *  - The third line contains the text "Numbers: " followed by the list of numbers in the drum.
     *      The first line goes from 1 to 10, the second from 11 to 20, and so on.
     *      To do this, a clone of the numbers list is created and sorted.
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Lottery drum\n");
        stringBuilder.append("Numbers left: ").append(numbers.size()).append("\n");
        stringBuilder.append("Numbers: ");
        ArrayList<Integer> sortedNumbers = (ArrayList<Integer>) numbers.clone();
        sortedNumbers.sort(Integer::compareTo);
        for (int i = 0; i < sortedNumbers.size(); i++) {
            if (i % 10 == 0) {
                stringBuilder.append("\n");
            }
            stringBuilder.append(sortedNumbers.get(i)).append(" ");
        }
        return stringBuilder.toString();
    }

}
