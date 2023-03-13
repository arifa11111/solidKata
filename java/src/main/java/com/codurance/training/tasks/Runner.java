package com.codurance.training.tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;


public class Runner implements Runnable {

    private  final Map<String, List<Task>> tasks;
    private final String quit;
    private final BufferedReader in;
    private final PrintWriter out;
    public Runner(BufferedReader in, PrintWriter out, Map<String, List<Task>> tasks, String quit) {
        this.in = in;
        this.out = out;
        this.tasks = tasks;
        this.quit = quit;
    }

    @Override
    public void run() {
        while (true) {
            out.print("> ");
            out.flush();
            String command;
            try {
                command = in.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            if (command.equals(quit)) {
                break;
            }
            new Execute(tasks,out).task(command);
        }
    }
}
