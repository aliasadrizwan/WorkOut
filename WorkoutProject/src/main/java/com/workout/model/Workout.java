package com.workout.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Workout {
    private List<Lift> lifts = new ArrayList<>();
    private LocalDate day;

    public Workout() {
        day = LocalDate.now();
    }

    public void addLift(Lift lift) {
        lifts.add(lift);
    }

    public void removeLift(Lift lift){
        lifts.remove(lift);
    }

    public List<Lift> getLifts() {
        return lifts;
    }

    public Lift getLift(String name) {
        for(Lift l : lifts) {
            if(l.getName().equals(name)) {
                return l;
            }
        }
        return null;
    }

    public void setDay(LocalDate day) {
        this.day = day;
    }

    public LocalDate getDay() {
        return day;
    }
}
