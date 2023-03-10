package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;
import java.util.Map;


public class AddDeadline implements TaskService {
    private final Map<String, List<Task>> tasks;
    private final PrintWriter out;

    public AddDeadline(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
    }
    @Override
    public void task(String commandLine) {
        String[] subcommandRest = commandLine.split(" ", 2);

        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {

            for (Task task : project.getValue()) {
                if (task.getId()==Long.parseLong(subcommandRest[0])) {
                    Date date = Date.valueOf(subcommandRest[1]);
                    task.setDeadline(date);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %s.", subcommandRest[0]);
        out.println();
    }
}
