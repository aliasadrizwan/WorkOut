package com.workout.model;

import java.util.ArrayList;
import java.util.List;

public class Setting {
    private List<LiftSetting> liftSettings;
    private int restTime;

    public Setting() {
        liftSettings = new ArrayList<>();
        restTime = 0;
    }

    public void addLiftSetting(LiftSetting setting) {
        liftSettings.add(setting);
    }

    public List<LiftSetting> getLiftSettings() {
        return liftSettings;
    }

    public void removeLiftSetting(int index) {
        liftSettings.remove(index);
    }

    public void setRestTime(int restTime) {
        this.restTime = restTime;
    }

    public int getRestTime() {
        return restTime;
    }
}
