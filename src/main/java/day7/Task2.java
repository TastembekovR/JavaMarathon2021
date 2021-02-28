package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int max = 100;
        int min = 90;
        int diff = max - min;
        Random rand = new Random();
        int i = rand.nextInt(diff + 1);
        i += min;
        Player pl1 = new Player(i);
        Player pl2 = new Player(i);
        Player pl3 = new Player(i);
        Player pl4 = new Player(i);
        Player pl5 = new Player(i);
        Player pl6 = new Player(i);
        Player.info();
        System.out.println(pl1.getStamina());
        for (int x = 0; pl1.getStamina() > 0; x++) {
            pl1.run();
        }
        Player.info();

    }
}
