package org.axample.lesson3.commands;

public class HelloCommand implements Command {

    @Override
    public Command execute() {
        System.out.println("Здравствуйте, введите пин код");
        String code = "123";

        if(code != "123") {
            return new ExitCommand();
        }
        return null;
    }
}
