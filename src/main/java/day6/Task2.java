package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane air1 = new Airplane("Boeing", 1994, 400, 15);
        air1.fillUp(10);
        air1.fillUp(15);
        air1.info();

    }
}
