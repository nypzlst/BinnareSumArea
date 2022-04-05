package Fivepr;

import Fourthpr.Command;

public interface Queue {
    void put(Command cmd);
    Command take();
}
