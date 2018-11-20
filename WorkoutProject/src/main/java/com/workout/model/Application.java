package com.workout.model;

import java.util.ArrayList;
import java.util.List;

public class Application {
    private List<User> users;

    Application() {
        users = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }
}
