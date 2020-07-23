package com.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"762746742677", "John", "Smith"},
            {"722746746277", "Ivone", "Novak"},
            {"760933212677", "Jessie", "Pinkman"},
            {"712355742677", "Walter", "White"},
            {"124176271257", "Clara", "Lanson"}};

    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00,};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
