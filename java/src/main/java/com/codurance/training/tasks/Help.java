package com.codurance.training.tasks;

import static java.lang.System.out;

public class Help implements HelpService {

    public void help() {
        out.println("Commands:");
        out.println("  show");
        out.println("  add project <project name>");
        out.println("  add task <project name> <task description> <customisable task ID>");
        out.println("  check <task ID>");
        out.println("  uncheck <task ID>");
        out.println("  delete  <task ID>");
        out.println("  deadline  <task ID> <Date of deadline(yyyy-mm-dd)>");
        out.println("  today");
        out.println("  view-by-deadline");
        out.println("  view-by-date");
        out.println("  view-by-project");
        out.println();
    }
}
