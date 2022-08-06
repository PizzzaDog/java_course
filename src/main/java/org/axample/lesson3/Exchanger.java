package org.axample.lesson3;

import java.io.IOException;

public interface Exchanger {
    Double exchange(Currency from, Currency to, Double amount) throws IOException;
}
