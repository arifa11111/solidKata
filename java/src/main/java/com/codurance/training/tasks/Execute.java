package com.codurance.training.tasks;

import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

public class Execute implements TaskService {

    private final Map<String, List<Task>> tasks;
    private final PrintWriter out;

    ShowService show;
    TaskService add;
    UpdateTaskService check ;
    UpdateTaskService uncheck ;
    HelpService help ;
    TaskService delete ;
    ShowService todayDeadlineTask ;
    ShowService viewByDeadline ;
    ErrorHandler errorHandler;

    public Execute(Map<String, List<Task>> tasks, PrintWriter out) {
        this.tasks = tasks;
        this.out = out;
        show = new Show(tasks,out);
        add  = new Add(tasks,out);
        check = new Check(tasks);
        uncheck= new Uncheck(tasks);
        help= new Help();
        delete= new Delete(tasks,out);
        todayDeadlineTask= new TodayDeadlineTask(tasks,out);
        viewByDeadline= new ViewByDeadline(tasks,out);
        errorHandler = new ErrorHandler();
    }


    public void task(String commandLine) {
        String[] commandRest = commandLine.split(" ", 2);
        String command = commandRest[0];
        switch (command) {
            case "show":
            case "view-by-project":
              show.show();
                break;
            case "add":
                add.task(commandRest[1]);
                break;
            case "check":
                check.updateTask(commandRest[1],true);
                break;
            case "uncheck":
                uncheck.updateTask(commandRest[1],false);
                break;
            case "help":
               help.help();
                break;
            case "delete":
                delete.task(commandRest[1]);
                break;
            case "today":
                todayDeadlineTask.show();
                break;
            case "view-by-deadline":
            case "view-by-date":
                viewByDeadline.show();
                break;
            default:
                errorHandler.error(command,out);
                break;
        }
    }

}
