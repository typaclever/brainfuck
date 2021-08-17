package project.reader;

import project.command.ActionCommandFactory;

import java.util.ArrayDeque;
import java.util.Deque;


public class Reader {

    private String[] symbols;

    public Reader(String input) {
        symbols = input.split("");
    }

    private int skipSymbols(int i, String[] symbols) {
        int count = 1;
        while (count != 0) {
            i++;
            if (symbols[i].equals("[")) {
                count++;
            }
            if (symbols[i].equals("]")) {
                count--;
            }
        }
        return i;
    }

    public void getTheResultOfCommandExecution() {
        Deque<Integer> indexesOfOpenSquareBracket = new ArrayDeque<>();
        for (int i = 0; i < symbols.length; i++) {
            if (ActionCommandFactory.getInstance().getActionCommand(symbols[i]).execute()) {
                if (symbols[i].equals("[")) {
                    i = skipSymbols(i, symbols);
                } else if (symbols[i].equals("]")) {
                    indexesOfOpenSquareBracket.removeLast();
                }
            } else {
                if (symbols[i].equals("[")) {
                    indexesOfOpenSquareBracket.addLast(i);
                } else if (symbols[i].equals("]")) {
                    i = indexesOfOpenSquareBracket.getLast();
                }
            }
        }
    }
}
