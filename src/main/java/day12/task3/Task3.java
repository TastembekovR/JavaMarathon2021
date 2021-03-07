package day12.task3;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static List<MusicBand> groupsAfter2000(List<MusicBand> mbList) {
        List<MusicBand> after2000 = new ArrayList<>();
        for (MusicBand x : mbList) {
            if (x.getYear() > 2000) {
                after2000.add(x);
            }
        }
        return after2000;
    }

    public static void main(String[] args) {
        List<MusicBand> mbList = Arrays.asList(new MusicBand("B1", 1995), new MusicBand("B2", 1996),
                new MusicBand("B3", 1997), new MusicBand("B4", 1998), new MusicBand("B5", 1999), new MusicBand("B6", 2000),
                new MusicBand("B7", 2001), new MusicBand("B8", 2002), new MusicBand("B9", 2003), new MusicBand("B10", 2004));
        Collections.shuffle(mbList);
        System.out.println(mbList);
        System.out.println(groupsAfter2000(mbList));
    }
}

