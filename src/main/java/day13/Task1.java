package day13;

public class Task1 {
    public static void main(String[] args) {
        User u1 = new User("u1");
        User u2 = new User("u2");
        User u3 = new User("u3");
        u1.sendMessage(u2, "Привет u2");
        u1.sendMessage(u3, "Привет u3");
        u2.sendMessage(u1, "Привет u1");
        u2.sendMessage(u3, "Привет u3");
        u3.sendMessage(u1, "Привет u1");
        u3.sendMessage(u2, "Привет u2");
        MessageDatabase.showDialog(u1, u3);
    }
}
