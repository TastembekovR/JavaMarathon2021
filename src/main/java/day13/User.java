package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private List<User> subscriptions;

    public User(String username) {
        this.username = username;
        subscriptions = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public List<User> getSubscription() {
        return subscriptions;
    }

    public void subscribe(User user) {
        subscriptions.add(user);
    }

    public boolean isSubscribed(User user) {
        if (subscriptions.contains(user)) {
            return true;
        } else return false;
    }

    public boolean isFriend(User user) {
        if (subscriptions.contains(user) && user.subscriptions.contains(this)) {
            return true;
        } else return false;
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return username;
    }
}