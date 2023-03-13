package com.codurance.training.tasks;

public class Main {
    public static void main(String[] args) {

        // Part One - If it is  a discrete light bulb, it does not have any brightness controls.
        DiscreteLights discreteLights = new DiscreteLights();
        System.out.println("Discrete lights: "+discreteLights.countDescreteLights());


        // Part Two - If it is a variable light bulb, it has brightness controls.
        VariableLights variableLights = new VariableLights();
        System.out.println("Discrete lights: "+variableLights.countVariableLights());

    }
}