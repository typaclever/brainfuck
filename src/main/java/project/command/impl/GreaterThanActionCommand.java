package project.command.impl;

import project.arrayAccess.impl.MainArrayAccess;
import project.command.ActionCommand;

public class GreaterThanActionCommand implements ActionCommand {
    @Override
    public boolean execute() {
        return MainArrayAccess.getInstance().moveToNextCell();
    }
}
