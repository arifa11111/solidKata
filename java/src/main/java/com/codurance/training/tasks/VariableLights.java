package com.codurance.training.tasks;

public class VariableLights {
    private final int[][] light = new int[1000][1000];

    LightService on;
    LightService off;
    LightService toggle;
    LightsCount count;

    LightSequence seq;

    public VariableLights(){
        on = new VariableLightOn(light);
        off = new VariableLightOff(light);
        toggle = new VariableLightToggle(light);
        count = new VariableLightsCount(light);

    }

    public int countVariableLights(){
        seq = new LightSequence(on,off,toggle,count);
        return seq.LightSequenece();
    }
}
