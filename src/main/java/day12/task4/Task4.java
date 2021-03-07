package day12.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {
        MusicBand lp = new MusicBand("Lp", 1999, new ArrayList<>(Arrays.asList("John", "Steve")));
        MusicBand lp1 = new MusicBand("Lp1", 2000, new ArrayList<>(Arrays.asList("John1", "Steve1")));
        MusicBand.transferMembers(lp, lp1);
        lp1.printMembers();
        lp.printMembers();
        System.out.println(lp.getMembers());
    }
}
