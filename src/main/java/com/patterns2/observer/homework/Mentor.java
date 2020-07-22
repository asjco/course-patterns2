package com.patterns2.observer.homework;


public class Mentor implements Observer2 {
    private final String name;
    private int updateCount;

    public Mentor(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentQueue studentQueue) {
        System.out.println(name + ", you have new task to check from: " + studentQueue.getName() + "\ntotal tasks from " + studentQueue.getName() + ": " + studentQueue.getTasks().size());
        updateCount++;
    }

    public String getName() {
        return name;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
