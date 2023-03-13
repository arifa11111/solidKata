package com.codurance.training.tasks;

public class VariableLightOff implements LightService{
    private final int[][] light;

    public VariableLightOff(int[][] light) {
        this.light = light;
    }

    @Override
    public void light(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                if (this.light[i][j] > 0) {
                    this.light[i][j] -= 1;
                }
            }
        }
    }
}
