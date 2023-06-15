package com.dmiit3iy.fieldoffortune.model;

import java.util.Objects;

public class Riddle {
    private String question;
    private String answer;

    public Riddle() {
    }

    public Riddle(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Riddle riddle = (Riddle) o;
        return Objects.equals(question, riddle.question) && Objects.equals(answer, riddle.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return "{question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }
}
