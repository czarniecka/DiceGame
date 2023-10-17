/**
 * Klasa reprezentująca gracza.
 */
public class Player {
    private final String name;
    private int result = 0;

    /**
     * Konstruktor klasy Player.
     * @param name imię gracza
     */
    public Player(String name) {
        this.name = name;
    }

    /**
     * Metoda zwracająca imię gracza.
     * @return imię gracza
     */
    public String getName() {
        return name;
    }
    /**
     * Metoda zwracająca wynik gracza.
     * @return wynik gracza
     */
    public int getResult() {
        return result;
    }
    /**
     * Metoda śledząca wyniki poszczególnych rund całej gry.
     */
    public void updateResult() {
        result += 1;
    }
}
