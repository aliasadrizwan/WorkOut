package com.workout.model;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userName;
    private String password;
    private Profile profile;
    private List<Workout> workoutList;

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.profile = new Profile();
        workoutList = new ArrayList<>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public void addWorkout(Workout workout) {
        workoutList.add(workout);
    }

    public List<Workout> getWorkouts() {
        return workoutList;
    }
}
