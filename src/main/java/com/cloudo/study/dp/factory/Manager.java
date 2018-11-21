package com.cloudo.study.dp.factory;

public class Manager implements Employee {
    @Override
    public int getPayCount() {
        return basicSalary*2;
    }

    @Override
    public String getDescription() {
        return "manager,so on";
    }
}
