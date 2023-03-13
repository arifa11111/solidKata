package com.codurance.training.tasks;

public class DiscreteLightOn implements LightService {
    private final boolean[][] light;

    public DiscreteLightOn(boolean[][] light) {
        this.light = light;
    }

    @Override
    public void light(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = true;
            }
        }
    }
}
