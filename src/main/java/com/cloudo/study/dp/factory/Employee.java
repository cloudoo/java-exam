package com.cloudo.study.dp.factory;

import java.io.Serializable;

public interface Employee extends Serializable {

      int basicSalary = 10;
      int fuckSalary = 2;
      int getPayCount();
      String getDescription();
}
