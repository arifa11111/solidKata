package com.codurance.training.tasks;

public class VariableLights {
    LightsCount count;

    VariableLights(LightsCount count){
        this.count = count;
    }
    public int countVariableLights(){
        return count.countLights();
    }
}
