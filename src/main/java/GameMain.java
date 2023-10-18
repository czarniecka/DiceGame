/**
 * Główna klasa programu.
 */
public class GameMain {
    /**
     * Główna metoda programu. Pobiera z linii poleceń imiona graczy i ilość rund.
     * Następnie rozpoczyna grę.
     *
     * @param args argumenty przekazywane do programu
     */
    public static void main(String[] args) {
        try {
            if (args.length != 3) {
                System.out.println("Enter: first name, second name, number of rounds(1-10)");
                return;
            }
            String name1 = args[0];
            String name2 = args[1];
            int amountRounds = Integer.parseInt(args[2]);

            if (amountRounds < 1 || amountRounds > 10) {
                System.out.println("Enter: first name, second name, number of rounds(1-10).");
                return;
            }

            DiceGame diceGame = new DiceGame(name1, name2);
            for (int i = 1; i <= amountRounds; i++) {
                System.out.println("Round: " + i);
                diceGame.playGame();
            }
            System.out.println("The result of the game: ");
            diceGame.gameResult();
        }
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
