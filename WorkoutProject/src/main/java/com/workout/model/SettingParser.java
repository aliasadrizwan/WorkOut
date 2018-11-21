package com.workout.model;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;

public class SettingParser {

    private static ObjectMapper jsonParser = new ObjectMapper();

    public static Setting buildSetting(String json) throws IOException {
        return null;
    }


    // Temporary class for mapping JSON attributes to appropriate values
    public class LiftProperties {

        private String liftName;
        private int weight;
        private int sets;
        private int reps;
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
    }
}
