package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class Uncheck implements UpdateTaskService{

    private final Map<String, List<Task>> tasks;

    public Uncheck(Map<String, List<Task>> tasks) {
        this.tasks = tasks;
    }

    @Override
    public void updateTask(String idString, boolean done) {
        int id = Integer.parseInt(idString);
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId() == id) {
                    task.setDone(false);
                    return;
                }
            }
        }
    }
}
