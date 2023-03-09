package com.codurance.training.tasks;

public class DiscreteLight implements LightsOperation {

    boolean light[][];

    DiscreteLight() {
        light = new boolean[1000][1000];
    }

    public void on(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = true;
            }
        }
    }

    public void off(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = false;
            }
        }
    }

    public void toggle(int startRow, int startColumn, int endRow, int endColumn) {
        for (int i=startRow;i<=endRow;i++) {
            for (int j=startColumn;j<=endColumn;j++) {
                this.light[i][j] = !this.light[i][j];
            }
        }
    }

    public int countLights() {
        int count = 0;
        for(int i=0;i<this.light.length;i++) {
            for (int j=0;j<this.light[i].length;j++){
                count += light[i][j] ? 1 : 0;
            }
        }

        return count;
    }
}