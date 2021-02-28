package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.setYear(1980);
        car1.info();
        System.out.println(car1.yearDifference(1970));
        Motorbike mb1 = new Motorbike("V8", "red",2000 );
        mb1.info();
        System.out.println(mb1.yearDifference(1980));
    }
}
