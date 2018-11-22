package com.workout.com.workout.dao;

import com.workout.model.LiftSetting;
import com.workout.model.Profile;
import com.workout.model.Setting;
import com.workout.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataFacade {
    private static List<User> userList = new ArrayList<>();
    private static DataFacade dataFacade = new DataFacade();

    private DataFacade(){
        userList.add(new User("ali","aaaaa"));
        userList.add(new User("aa","aaaaa"));
        userList.add(new User("bb","bbbbb"));

        User user = new User("test","test");
        LiftSetting ls = new LiftSetting("Squat",225,5,10,10);
        Setting s = new Setting();
        s.addLiftSetting(ls);
        user.updateSetting(s);
        userList.add(user);
    }
    public static void addUser(User user){
        userList.add(user);
    }

    public static void removeUser(User user){
        userList.remove(user);
    }

    public static List<User> getUserList(){
        return  userList;
    }

    public static User getUser(String userName){
        for(User u : userList){
            if(u.getUserName().equals(userName)){
                return u;
            }
        }
        return null;
    }

//    public static boolean addProfile(String userName, Profile profile){
//        if(userName != null) {
//            for (User u : userList) {
//                if (u.getUserName().equals(userName)) {
//                    u.setProfile(profile);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

}
