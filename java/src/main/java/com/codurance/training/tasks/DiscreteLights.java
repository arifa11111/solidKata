package com.codurance.training.tasks;

public class DiscreteLights {

    private final boolean[][] light = new boolean[1000][1000];

    LightService on;
    LightService off;
    LightService toggle;

    LightsCount count;

    LightSequence seq;

    public DiscreteLights(){
        on = new DiscreteLightOn(light);
        off = new DiscreteLightOff(light);
        toggle = new DiscreteLightToggle(light);
        count = new DiscreteLightCount(light);
    }

    public int countDescreteLights(){
        seq = new LightSequence(on,off,toggle,count);
        return seq.LightSequenece();
    }
}
