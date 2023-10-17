/**
 * Klasa zawierająca algorytm gry.
 */
public class DiceGame {
    private final Player Player1;
    private final Player Player2;
    private final Dice dice;

    /**
     * Konstruktor klasy.
     * @param Name1 imię pierwszego gracza
     * @param Name2 imię drugiego gracza
     */
    public DiceGame(String Name1, String Name2) {
        Player1 = new Player(Name1);
        Player2 = new Player(Name2);
        dice = new Dice();
    }

    /**
     * Metoda zawierająca zasady pojedynczej rundy. Wygrywa osoba, która w poszczególnej rundzie wyrzuci więcej oczek na kostce.
     */
    public void playGame() {
        int throw1 = dice.throwDice();
        int throw2 = dice.throwDice();

        System.out.println(Player1.getName() + " " + throw1);
        System.out.println(Player2.getName() + " " + throw2);

        if (throw1 >  throw2) {
            System.out.println(Player1.getName() + " wins the round.");
            Player1.updateResult();
        } else if (throw1 < throw2) {
            System.out.println(Player2.getName() + " wins the round.");
            Player2.updateResult();
        } else {
            System.out.println("Draw.");
            Player1.updateResult();
            Player2.updateResult();
        }
    }
    /**
     * Metoda zawierająca wynik gry. Wygrywa osoba, która wygrała więcej rund.
     */
    public void gameResult() {
        if (Player1.getResult() > Player2.getResult()) {
            System.out.println(Player1.getName() + " wins the game.");
        } else if (Player1.getResult() < Player2.getResult()) {
            System.out.println(Player2.getName() + " wins the game.");
        } else {
            System.out.println("Draw.");
        }
    }
}
