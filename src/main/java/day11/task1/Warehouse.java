package day11.task1;

public class Warehouse {
    private int countPickedOrders;

    public int getCountPickedOrders() {
        return countPickedOrders;
    }

    public int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public void deliveredPlus() {
        countDeliveredOrders++;
    }

    private int countDeliveredOrders;

    public String toString() {
        return "Количество собранных заказов " + countPickedOrders + ", Количество доставленных заказов " + countDeliveredOrders;
    }

    public void deliveryUp() {
        countDeliveredOrders++;
    }public void pickedUp() {
        countPickedOrders++;
    }
}