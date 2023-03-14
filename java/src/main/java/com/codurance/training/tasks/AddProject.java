package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddProject implements TaskService{
    private final Map<String, List<Task>> tasks;
    private final PrintWriter out;

    public AddProject(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
    }
    @Override
    public void task(String project) {
        tasks.put(project, new ArrayList<Task>());
    }
}