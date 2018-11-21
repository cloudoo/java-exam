package com.cloudo.study.dp.command;

public interface Command {
    void execute();
    void undo();
}
