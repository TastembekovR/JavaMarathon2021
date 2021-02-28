package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city;
        city = scan.next();
        while (!city.equals("Stop")) {
            switch (city) {
                case "Москва":
                case "Владивосток":
                case "Ростов": {
                    System.out.println("Россия");
                    city = scan.next();
                }
                break;
                case "Рим":
                case "Милан":
                case "Турин": {
                    System.out.println("Италия");
                    city = scan.next();
                }
                break;
                case "Ливерпуль":
                case "Манчестер":
                case "Лондон": {
                    System.out.println("Англия");
                    city = scan.next();
                }
                break;
                case "Берлин":
                case "Мюнхен":
                case "Кёльн": {
                    System.out.println("Германия");
                    city = scan.next();
                }
                break;
                default:
                    System.out.println("Неизвестная страна");
                    city = scan.next();
                    break;
            }
        }
    }
}
