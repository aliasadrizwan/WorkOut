package com.workout.model;

public class LiftSetting {
    private Lift lift;
    private int progress;

    public LiftSetting(String name, int set, int rep, int weight, int progress) {
        lift = new Lift();
        update(name,set,rep,weight,progress);
    }

    public int getSets() {
        return lift.getSets();
    }

    public int getReps() {
        return lift.getReps();
    }

    public int getWeight() {
        return lift.getWeight();
    }

    public int getProgress() {
        return progress;
    }

    public void update(String name, int set, int rep, int weight, int progress) {
        lift.setName(name);
        lift.setSets(set);
        lift.setReps(rep);
        lift.setWeight(weight);
        this.progress = progress;
    }

}
