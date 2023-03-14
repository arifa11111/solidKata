package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import static java.lang.System.out;

public class AddTask implements AddTaskService{
    private final Map<String, List<Task>> tasks;
    private final PrintWriter out;

    public AddTask(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
    }

    @Override
    public void addTask(String project, String description) {
        String[] subcommand = description.split(" ");
        List<Task> projectTasks = tasks.get(project);

        if (projectTasks == null) {
            out.printf("Could not find a project with the name \"%s\".", project);
            out.println();
            return;
        }
        if(!Pattern.matches("^(0|[1-9][0-9]*)$", subcommand[1])){
            out.printf("Task Id should match this pattern \"no special characters and spaces\".");
            out.println();
        }
        else{
            projectTasks.add(new Task(Integer.parseInt(subcommand[1]), subcommand[0], false));
        }
    }
}
