package com.codurance.training.tasks;

public class DiscreteLights {

    LightsCount count;

    public DiscreteLights(LightsCount count) {
        this.count=count;
    }

    public int countDescreteLights(){
        return count.countLights();
    }
}
