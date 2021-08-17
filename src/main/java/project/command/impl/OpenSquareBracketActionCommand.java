package project.command.impl;


import project.arrayAccess.impl.MainArrayAccess;
import project.command.ActionCommand;

public class OpenSquareBracketActionCommand implements ActionCommand {

    @Override
    public boolean execute() {
        return MainArrayAccess.getInstance().getValueFromCurrentCell() == 0;
    }
}
