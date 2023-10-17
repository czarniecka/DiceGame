/**
 * Klasa zawierająca algorytm gry.
 */
public class DiceGame {
    private final Player player1;
    private final Player player2;
    private final Dice dice;

    /**
     * Konstruktor klasy.
     *
     * @param name1 imię pierwszego gracza
     * @param name2 imię drugiego gracza
     */
    public DiceGame(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        dice = new Dice();
    }

    /**
     * Metoda zawierająca zasady pojedynczej rundy.
     * Wygrywa osoba, która w poszczególnej rundzie wyrzuci więcej oczek na kostce.
     */
    public void playGame() {
        int throw1 = dice.throwDice();
        int throw2 = dice.throwDice();

        System.out.println(player1.getName() + " " + throw1);
        System.out.println(player2.getName() + " " + throw2);

        if (throw1 >  throw2) {
            System.out.println(player1.getName() + " wins the round.");
            player1.updateResult();
        } else if (throw1 < throw2) {
            System.out.println(player2.getName() + " wins the round.");
            player2.updateResult();
        } else {
            System.out.println("Draw.");
            player1.updateResult();
            player2.updateResult();
        }
    }
    /**
     * Metoda zawierająca wynik gry. Wygrywa osoba, która wygrała więcej rund.
     */
    public void gameResult() {
        if (player1.getResult() > player2.getResult()) {
            System.out.println(player1.getName() + " wins the game.");
        } else if (player1.getResult() < player2.getResult()) {
            System.out.println(player2.getName() + " wins the game.");
        } else {
            System.out.println("Draw.");
        }
    }
}
