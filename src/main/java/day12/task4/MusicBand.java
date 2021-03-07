package day12.task4;

import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicBand> bands;
    private List<String> members;

    public MusicBand(String name, int year, List<String> members) {
        this.name = name;
        this.year = year;
        this.members = members;
    }

    public List<String> getMembers() {
        return members;
    }

    public static void transferMembers(MusicBand a, MusicBand b) {
        a.members.addAll(b.members);
    }

    public List<MusicBand> getBands() {
        return bands;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void printMembers() {
        System.out.println(members);
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", bands=" + bands +
                ", members=" + members +
                '}';
    }
}

