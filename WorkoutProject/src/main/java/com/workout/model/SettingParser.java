package com.workout.model;
import java.io.IOException;

public class SettingParser {


    public static Setting buildSetting(String settings) throws IOException {
        System.out.println(settings);
        return null;
    }


    // Temporary class for mapping JSON attributes to appropriate values
    public class LiftProperties {

        private String liftName;
        private int sets;
        private int reps;
        private int weight;
        private int progress;

        LiftProperties() {

        }

        public String getLiftName() {
            return liftName;
        }

        public void setLiftName(String liftName) {
            this.liftName = liftName;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
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

        public int getProgress() {
            return progress;
        }

        public void setProgress(int progress) {
            this.progress = progress;
        }

        public String toString() {
            return "name : " + liftName + "\n" +
                    "weight : " + weight + "\n" +
                    "sets : " + sets + "\n" +
                    "reps : " + reps + "\n" +
                    "progress : " + progress;
        }
    }
}
