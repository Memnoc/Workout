package com.smartdroidesign.workout.Classes;

/**
 * Created by mstara on 11/01/2018.
 */

public class Workout {

    private String name;
    private String description;

    public static final Workout[] workouts = {
            new Workout("The Limb Loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 Pull-ups"),
            new Workout("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n15 Squats"),
            new Workout("The Wimp Special",
                    "5 Pull-ups\n10 Push-ups\n15 Squats"),
            new Workout("Strenght and Length",
                    "500 meter run\n21 x 1.5 pood kettleball swing\n21 x pull-ups")
    };

//    Each Workout has a name and description
    private Workout(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getDescription(){
        return description;
    }                                   // Getters for the prvate variables

    public String getName() {
        return name;
    }
                                        // The String representation of a workout is its name
    public String toString(){
        return this.name;
    }
}
