package com.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentQueue implements Observable2 {
    private final List<Observer2> mentors;
    private final List<String> tasks;
    private final String name;

    public StudentQueue(String name) {
        mentors = new ArrayList<>();
        tasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyMentors();
    }

    @Override
    public void addObserver(Observer2 observer) {
        mentors.add(observer);
    }

    @Override
    public void notifyMentors() {
        for (Observer2 mentor : mentors) {
            mentor.update(this);
        }
    }

    @Override
    public void removeObserver(Observer2 observer) {
        mentors.remove(observer);
    }

    public List<String> getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
