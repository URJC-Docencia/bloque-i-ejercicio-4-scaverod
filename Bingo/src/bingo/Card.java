package bingo;


/**
 * This class represents a player in a bingo game.
 */
class Card {


    /**
     * El cartón tiene números.
     * Los números tienen que estar en líneas
     * Saber cuándo se queda vacio para poder cantar bingo
     * Saber cuántos números me quedan de cada línea para poder cantar línea
     * 
     * ¿Qué operaciones tengo que hacer?
     *  - Tachar --> eliminar, tener constancia de que ese número ya ha salido
     */

    /**
     * Opción 1: Lista de Sets. 
     *      Desventaja: hay que iterar todos los sets para saber si tienes el número
     * 
     * Opción 2: Mapa Número -> Línea
     *           Mapa Línea -> Números que faltan por salir
     *      Ventaja: todas las operaciones se hacen en O(1).
     */
}
