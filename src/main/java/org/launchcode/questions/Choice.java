package org.launchcode.questions;

public class Choice {
    private final String content;
    private final boolean correct;

    public Choice(String content, boolean correct) {
        this.content = content;
        //this.isCorrect = isCorrect;
        this.correct = correct;
    }

    public Choice(String content){
        this(content, false);
    }
    public String getContent() {
        return content;
    }

    public boolean isCorrect() {
        return correct;
    }
}
