package project.arrayAccess.impl;

import project.arrayAccess.ArrayAccess;

public class MainArrayAccess implements ArrayAccess {
    private static MainArrayAccess mainArrayAccess;
    private int[] arr;
    private int currentIndex;

    private MainArrayAccess() {
        this.arr = new int[30000];
        currentIndex = 0;
    }

    public static MainArrayAccess getInstance() {
        return mainArrayAccess != null ? mainArrayAccess : (mainArrayAccess = new MainArrayAccess());
    }

    @Override
    public boolean moveToNextCell() {
        currentIndex++;
        return true;
    }

    @Override
    public boolean moveToPreviousCell() {
        currentIndex--;
        return true;
    }

    @Override
    public boolean incrementTheValueInTheCurrentCell() {
        arr[currentIndex]++;
        return true;
    }

    @Override
    public boolean decrementTheValueInTheCurrentCell() {
        arr[currentIndex]--;
        return true;
    }

    @Override
    public int getValueFromCurrentCell() {
        return arr[currentIndex];
    }

}
