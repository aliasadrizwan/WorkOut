package com.workout.model;

public class Profile {
    private String email;
    private double weight;
    private double height;

    public Profile() {
    //TODO: some code here.
    }

    public Profile(String email, double weight, double height) {
        this.email = email;
        this.weight = weight;
        this.height = height;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
