package org.axample.lesson3.commands;

public class ErrorCommand implements Command {
    @Override
    public Command execute() {
        System.out.println("Error\nTry again later\n");
        return new HomePageCommand();
    }
}
