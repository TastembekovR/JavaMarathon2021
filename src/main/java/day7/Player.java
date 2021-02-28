package day7;

public class Player {
    final static int MAX_STAMINA = 100;
    final static int MIN_STAMINA = 0;
    private static int countPlayers = 0;
    private int stamina;

    public Player(int stamina) {
        this.stamina = stamina;
        if (countPlayers == 6) {
            countPlayers = 6;
        } else countPlayers++;

    }

    public static void info() {
        if (countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }
        if (countPlayers == 6) {
            System.out.println("На поле нет свободных мест");
        }
    }

    public void run() {
        stamina--;
        if (stamina == 0) {
            countPlayers--;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return stamina;
    }


}
