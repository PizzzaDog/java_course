package org.axample.lesson3;

import org.axample.lesson3.commands.Command;

public class ExchangerController {

    //TODO think about it
    private ExchangerImpl exchanger;

    //TODO fix this
    public void start(Command command) {
        command.execute();
    }
}
