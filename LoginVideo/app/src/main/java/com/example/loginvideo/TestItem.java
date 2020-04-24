package com.example.loginvideo;

import java.util.Objects;

public class TestItem {
    String question;
    String answer;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TestItem testItem = (TestItem) o;
        return Objects.equals(question, testItem.question) &&
                Objects.equals(answer, testItem.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(question, answer);
    }

    @Override
    public String toString() {
        return "TestItem{" +
                "question='" + question + '\'' +
                ", answer='" + answer + '\'' +
                '}';
    }

    public TestItem(String question, String answer) {
        this.question = question;
        this.answer = answer;
    }


}
