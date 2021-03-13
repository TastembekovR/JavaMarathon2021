//package day12;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class Task2 {
//    public static void main(String[] args) {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 31; i++) {
//            if (i % 2 == 0) {
//                list.add(i);
//            }
//            for (int i = 300; i < 351; i++) {
//                if (i % 2 == 0) {
//                    list.add(i);
//                }
//            }
//            System.out.println(list);
//        }
//    }
//}
package day12;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 351; i++) {
            if (i % 2 == 0 && i < 31) {
                list.add(i);
            } else if (i > 299 && i < 351 && i % 2 == 0) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
}
