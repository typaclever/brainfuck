package project.command.impl;

import project.arrayAccess.impl.MainArrayAccess;
import project.command.ActionCommand;

public class CloseSquareBracketActionCommand implements ActionCommand {

    @Override
    public boolean execute() {
        return MainArrayAccess.getInstance().getValueFromCurrentCell() == 0;
    }
}
