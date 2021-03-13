package day14;

import java.io.File;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        File f1 = new File("people");
        System.out.println(Arrays.asList(Person.parseFileToObjList(f1)));
    }
}
