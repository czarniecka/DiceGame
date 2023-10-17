import java.util.Random;

/**
 * Klasa reprezentująca sześcienną kostkę do gry z oczkami od 1 do 6.
 */
public class Dice {
    /**
     * Metoda imitująca rzut sześcienną kostką.
     * @return losowa liczba oczek na kostce po rzucie
     */
    public int throwDice() {
        Random amountPoints = new Random();
        return amountPoints.nextInt(6)+1;
    }
}