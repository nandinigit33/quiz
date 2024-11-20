package org.launchcode.questions;

public class MultipleChoice extends Question{
//Class 'MultipleChoice' must either be declared abstract or implement abstract method 'toString()' in 'Question'
public MultipleChoice(String question, Choice[] choiceArray){
    super(question, choiceArray);
}

    @Override
    public String toString() {
    String newLine = System.lineSeparator();
        return newLine = "CHOOSE ONE:" + newLine +
                getQuestion() + newLine +
                getFormattedChoices();
    }
}
