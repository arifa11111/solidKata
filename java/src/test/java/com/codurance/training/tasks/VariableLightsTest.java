package com.codurance.training.tasks;

import org.junit.Assert;
import org.junit.Test;

public class VariableLightsTest {

    private final int[][] light = new int[1000][1000];

    @Test
    public void main(){
        VariableLightOn on = new VariableLightOn(light);
        VariableLightOff off = new VariableLightOff(light);
        VariableLightToggle toggle = new VariableLightToggle(light);
        VariableLightsCount count = new VariableLightsCount(light);

        VariableLights variableLights = new VariableLights(count);

        on.light(887, 9, 959, 629);
        on.light(454, 398, 844, 448);
        off.light(539, 243, 559, 965);
        off.light(370, 819, 676, 868);
        off.light(145, 40, 370, 997);
        off.light(301, 3, 808, 453);
        on.light(351, 678, 951, 908);
        toggle.light(720, 196, 897, 994);
        toggle.light(831, 394, 904, 860);

        Assert.assertEquals(variableLights.countVariableLights(),539560);
    }
}
