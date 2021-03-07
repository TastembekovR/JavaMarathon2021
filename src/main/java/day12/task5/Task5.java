package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand lp = new MusicBand("LP", 1999, new ArrayList<>(Arrays.asList(new MusicArtist("John", 20))));
        MusicBand lp1 = new MusicBand("LP1", 2000, new ArrayList<>(Arrays.asList(new MusicArtist("John1", 21))));
        MusicBand.transferMembers(lp,lp1);
        lp.printMembers();
        lp1.printMembers();
        System.out.println(lp.getMembers());
        System.out.println(lp1.getMembers());
    }
}
