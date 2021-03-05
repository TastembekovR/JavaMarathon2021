package day11.task1;

public class Picker implements Worker {
    private int salary;
    private boolean isPayed;
    Warehouse w1;

    public Picker(Warehouse w1) {
        this.w1 = w1;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isPayed() {
        return isPayed;
    }

    public String toString() {
        return "Зарплата " + salary + ", был выплачен бонус и   ли нет" + isPayed;
    }

    @Override
    public void doWork() {
        salary += 80;
        w1.pickedUp();
    }

    @Override
    public void bonus() {
        if (w1.getCountDeliveredOrders() == 10000) {
            salary += 70000;
        } else if (w1.getCountDeliveredOrders() > 10000) {
            System.out.println("Бонус уже был выплачен");
        } else {
            System.out.println("Бонус пока не доступен");
        }
    }
}