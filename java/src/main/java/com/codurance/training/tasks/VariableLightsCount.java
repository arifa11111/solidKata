package com.codurance.training.tasks;

public class VariableLightsCount implements LightsCount{
    private final int[][] light;

    public VariableLightsCount(int[][] light) {
        this.light = light;
    }

    @Override
    public int countLights() {
        int count = 0;
        for(int i=0;i<this.light.length;i++) {
            for (int j=0;j<this.light[i].length;j++){
                count += light[i][j];
            }
        }
        return count;
    }
}
