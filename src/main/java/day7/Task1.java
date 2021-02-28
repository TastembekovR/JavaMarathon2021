package day7;

import java.util.concurrent.atomic.AtomicBoolean;

public class Task1 {
    public static void main(String[] args) {
        Airplane a1 = new Airplane("Boeing", 1990, 200, 30);
        Airplane a2 = new Airplane("S7", 1990, 250, 30);
        Airplane.compareAirplanes(a1, a2);
    }
}