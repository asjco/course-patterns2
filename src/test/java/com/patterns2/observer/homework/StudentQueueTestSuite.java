package com.patterns2.observer.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StudentQueueTestSuite {
    @Test
    public void testStudentQueueObserver() {
        //Given
        StudentQueue sashaQueue = new SashaQueue();
        StudentQueue simonQueue = new SimonQueue();
        StudentQueue johnQueue = new JohnQueue();
        Mentor sam = new Mentor("Sam");
        Mentor eddy = new Mentor("Eddy");
        sashaQueue.addObserver(sam);
        simonQueue.addObserver(sam);
        johnQueue.addObserver(eddy);
        //When
        sashaQueue.addTask("task 1 from Sasha");
        simonQueue.addTask("task 1 from Simon");
        johnQueue.addTask("task 1 from John");
        //Then
        assertEquals(2, sam.getUpdateCount());
        assertEquals(1, eddy.getUpdateCount());


    }
}
