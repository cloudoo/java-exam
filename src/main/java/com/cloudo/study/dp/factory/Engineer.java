package com.cloudo.study.dp.factory;

public class Engineer implements Employee {
    @Override
    public int getPayCount() {
        return basicSalary;
    }

    @Override
    public String getDescription() {
        return "coding,debug,develope";
    }

}
