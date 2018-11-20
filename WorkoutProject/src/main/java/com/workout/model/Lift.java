package com.workout.model;

public class Lift {

    private String name;        // name of lift
    private int sets;           // number of sets to do
    private int reps;           // number of reps to do
    private int weight;         // weight to lift

    public Lift() {

    }

    public Lift(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSets() {
        return sets;
    }

    public void setSets(int sets) {
        this.sets = sets;
    }

    public int getReps() {
        return reps;
    }

    public void setReps(int reps) {
        this.reps = reps;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

}
