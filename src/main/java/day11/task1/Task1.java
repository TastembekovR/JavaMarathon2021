package day11.task1;

public class Task1 {
    static void businessProcess(Worker worker) {
        for (int i = 0; i < 10000; i++) {
            worker.doWork();
        }
        worker.bonus();
    }

    public static void main(String[] args) {
        Warehouse w1 = new Warehouse();
        Courier c1 = new Courier(w1);
        Picker p1 = new Picker(w1);
        businessProcess(c1);
        System.out.println(w1.getCountDeliveredOrders());
        System.out.println(c1.getSalary());
        businessProcess(p1);
        System.out.println(w1.getCountPickedOrders());
        System.out.println(p1.getSalary());
        Warehouse w2 = new Warehouse();
        Courier c2 = new Courier(w2);
        Picker p2 = new Picker(w2);
        c2.doWork();
        p2.doWork();
    }
}
