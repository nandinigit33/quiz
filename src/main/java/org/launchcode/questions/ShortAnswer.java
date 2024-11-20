package org.launchcode.questions;

public class ShortAnswer extends Question {

    public ShortAnswer(String question) {
        super(question);
    }

    @Override
    public String toString(){
        String newLine = System.lineSeparator();
        return newLine + getQuestion() + newLine + "Please enter a  response (80 characters max):" + newLine;
    }

    @Override
    public boolean isInvalid(String resp){
        return resp.length() > 80;
    }
}
