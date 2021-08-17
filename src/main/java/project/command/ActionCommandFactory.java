package project.command;

import project.command.impl.CloseSquareBracketActionCommand;
import project.command.impl.DotActionCommand;
import project.command.impl.GreaterThanActionCommand;
import project.command.impl.LessThanActionCommand;
import project.command.impl.MinusActionCommand;
import project.command.impl.OpenSquareBracketActionCommand;
import project.command.impl.PlusActionCommand;

import java.util.HashMap;
import java.util.Map;

public class ActionCommandFactory {
    private static ActionCommandFactory actionCommandFactory;
    private Map<String, ActionCommand> stringActionCommandMap;

    private ActionCommandFactory() {
        stringActionCommandMap = new HashMap<>();
        stringActionCommandMap.put(">", new GreaterThanActionCommand());
        stringActionCommandMap.put("<", new LessThanActionCommand());
        stringActionCommandMap.put("+", new PlusActionCommand());
        stringActionCommandMap.put("-", new MinusActionCommand());
        stringActionCommandMap.put(".", new DotActionCommand());
        stringActionCommandMap.put("[", new OpenSquareBracketActionCommand());
        stringActionCommandMap.put("]", new CloseSquareBracketActionCommand());
    }

    public static ActionCommandFactory getInstance() {
        return actionCommandFactory != null
                ? actionCommandFactory
                : (actionCommandFactory = new ActionCommandFactory());
    }

    public ActionCommand getActionCommand(String symbol) {
        return stringActionCommandMap.get(symbol);
    }

}
