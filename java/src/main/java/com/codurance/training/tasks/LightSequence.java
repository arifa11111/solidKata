package com.codurance.training.tasks;

public class LightSequence {

    private  final LightService on;
    private  final LightService off;
    private  final LightService toggle;
    private  final LightsCount count;

    LightSequence(LightService on, LightService off, LightService toggle, LightsCount count){
        this.on = on;
        this.off = off;
        this.toggle = toggle;
        this.count = count;
    }

    public int LightSequenece(){
        on.light(887, 9, 959, 629);
        on.light(454, 398, 844, 448);
        off.light(539, 243, 559, 965);
        off.light(370, 819, 676, 868);
        off.light(145, 40, 370, 997);
        off.light(301, 3, 808, 453);
        on.light(351, 678, 951, 908);
        toggle.light(720, 196, 897, 994);
        toggle.light(831, 394, 904, 860);

        return countOfLights();
    }

    public int countOfLights(){
        return count.countLights();
    }
}
