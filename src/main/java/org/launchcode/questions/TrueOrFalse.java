package org.launchcode.questions;

public class TrueOrFalse extends Question {

    public TrueOrFalse(String question, Choice[] choiceArray){
        super(question, choiceArray);
    }

    @Override
    public String toString() {
        String newLine = System.lineSeparator();
        return newLine = "TRUE OR FALSE:" + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }
}
