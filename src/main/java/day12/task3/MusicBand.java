package day12.task3;

import javax.xml.namespace.QName;
import java.util.List;

public class MusicBand {
    private String name;
    private int year;
    private List<MusicBand> bands;

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public List<MusicBand> getBands() {
        return bands;
    }

    public void setBands(List<MusicBand> bands) {
        this.bands = bands;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}