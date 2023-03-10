package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Delete  implements TaskService{

    private final Map<String, List<Task>> tasks;
    private final PrintWriter out;

    public Delete(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
    }
    @Override
    public void task(String idString) {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            for (Task task : project.getValue()) {
                if (task.getId()==Long.parseLong(idString)) {
                    project.getValue().remove(task);
                    return;
                }
            }
        }
        out.printf("Could not find a task with an ID of %s.", idString);
        out.println();
    }
}
