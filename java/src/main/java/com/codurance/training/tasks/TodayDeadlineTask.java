package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class TodayDeadlineTask implements ShowService {

    private final  Map<String, List<Task>> tasks;
    private final PrintWriter out;

    public TodayDeadlineTask(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
    }
    @Override
    public void show() {
        for (Map.Entry<String, List<Task>> project : tasks.entrySet()) {
            out.println(project.getKey());
            for (Task task : project.getValue()) {
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                if (task.getDeadline() != null && task.getDeadline().toString().equals(formatter.format(new Date()))) {
                    out.println(task.getDescription());
                }
            }
            out.println();
        }
    }
}
