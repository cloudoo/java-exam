package com.cloudo.study.dp.factory;

public class EmploySimplyFactory {

    public static Employee getEmployee(String type){

        if(type.equals("ENGINEER")){
            return new Engineer();
        }else  if(type.equals("SALEMAN")){
            return new SaleMan();
        }else  if(type.equals("MANAGER")){
            return new Manager();
        } else if(type.equals("SinorEngineer")){
            return null;
        }else{

            return null;

        }


    }

    public static void main(String[] args) {

        try {
        for(int i=0;i<100000;i++){
                Thread.sleep(10);
            Employee employee = EmploySimplyFactory.getEmployee("ENGINEER");
            System.out.println("create:NO-"+i);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
