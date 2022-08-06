package org.axample.lesson3.commands;

public class SuccessCommand implements Command {
    @Override
    public Command execute() {
        System.out.println("Congratulations!\nThe exchange was successful\n");
        return new HomePageCommand();
    }
}
