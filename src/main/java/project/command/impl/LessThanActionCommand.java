package project.command.impl;

import project.arrayAccess.impl.MainArrayAccess;
import project.command.ActionCommand;

public class LessThanActionCommand implements ActionCommand {
    @Override
    public boolean execute() {
        return MainArrayAccess.getInstance().moveToPreviousCell();
    }
}
