package org.axample.lesson3.commands;

public class HomePageCommand implements Command {
    @Override
    public Command execute() {
        System.out.println("\n\tCurrency Exchanger | HomePage\n");
        return null;
    }
}
