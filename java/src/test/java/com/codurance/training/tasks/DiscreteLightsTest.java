package com.codurance.training.tasks;

import org.junit.Assert;
import org.junit.Test;

public class DiscreteLightsTest {

    private final boolean[][] light = new boolean[1000][1000];

    @Test
    public void main(){
        DiscreteLightOn on = new DiscreteLightOn(light);
        DiscreteLightOff off = new DiscreteLightOff(light);
        DiscreteLightToggle toggle = new DiscreteLightToggle(light);
        DiscreteLightCount count = new DiscreteLightCount(light);

        DiscreteLights discreteLights = new DiscreteLights(count);

        on.light(887, 9, 959, 629);
        on.light(454, 398, 844, 448);
        off.light(539, 243, 559, 965);
        off.light(370, 819, 676, 868);
        off.light(145, 40, 370, 997);
        off.light(301, 3, 808, 453);
        on.light(351, 678, 951, 908);
        toggle.light(720, 196, 897, 994);
        toggle.light(831, 394, 904, 860);

        Assert.assertEquals(discreteLights.countDescreteLights(),230022);
    }
}
