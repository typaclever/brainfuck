package project.command.impl;

import project.arrayAccess.impl.MainArrayAccess;
import project.command.ActionCommand;

public class MinusActionCommand implements ActionCommand {
    @Override
    public boolean execute() {
        return MainArrayAccess.getInstance().decrementTheValueInTheCurrentCell();
    }
}
