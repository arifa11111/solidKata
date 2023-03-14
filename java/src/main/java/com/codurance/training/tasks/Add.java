package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Add implements TaskService{

    private final Map<String, List<Task>> tasks;
    private final PrintWriter out;

    public Add(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
    }

    @Override
    public void task(String commandLine) {
        String[] subcommandRest = commandLine.split(" ", 2);
        String subcommand = subcommandRest[0];
        String[] projectTask;
        if (subcommand.equals("project")) {
            new AddProject(tasks,out).task(subcommandRest[1]);
        } else if (subcommand.equals("task")) {
            projectTask = subcommandRest[1].split(" ", 2);
            new AddTask(tasks,out).addTask(projectTask[0], projectTask[1]);
        } else if (subcommand.equals("deadline")) {
            new AddDeadline(tasks,out).task(subcommandRest[1]);
        }
        else{
                new ErrorHandler().error(subcommand, out);
            }
        }
    }
