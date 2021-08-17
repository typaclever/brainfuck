package project.command.impl;

import project.arrayAccess.impl.MainArrayAccess;
import project.command.ActionCommand;

public class DotActionCommand implements ActionCommand {


    @Override
    public boolean execute() {
        System.out.print((char) MainArrayAccess.getInstance().getValueFromCurrentCell());
        return true;
    }

}
