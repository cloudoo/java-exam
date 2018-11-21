package com.cloudo.study.dp.command;

import java.util.List;

/**
 * Created by cloudpj on 18/11/21.
 */
public class MacroCommand implements Command{

    List<Command> commands;

    public MacroCommand(List<Command> commands){
        this.commands = commands;
    }
    @Override
    public void execute() {
        if(commands!=null)
        for(Command command:commands){
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(int i=commands.size()-1;i>=0;i--){
            Command command = commands.get(i);
            command.undo();
        }
    }
}
