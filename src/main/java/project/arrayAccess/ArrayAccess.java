package project.arrayAccess;

public interface ArrayAccess {
    boolean moveToNextCell();

    boolean moveToPreviousCell();

    boolean incrementTheValueInTheCurrentCell();

    boolean decrementTheValueInTheCurrentCell();

    int getValueFromCurrentCell();
}
