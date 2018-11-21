package com.workout.com.workout.dao;

import com.workout.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataFacade {
    private static List<User> userList = new ArrayList<>();

    public static void addUser(User user){
        userList.add(user);
    }

    public static void removeUser(User user){
        userList.remove(user);
    }

    public static List<User> getUserList(){
        return  userList;
    }
}
