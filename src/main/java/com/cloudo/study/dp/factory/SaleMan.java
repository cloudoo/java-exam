package com.cloudo.study.dp.factory;

public class SaleMan implements Employee {


    @Override
    public int getPayCount() {
        return basicSalary+fuckSalary;
    }

    @Override
    public String getDescription() {
        return "report,sales";
    }
}
