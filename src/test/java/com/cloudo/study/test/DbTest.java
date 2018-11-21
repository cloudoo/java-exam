package com.cloudo.study.test;

import com.cloudo.study.DatabaseUtil;
import org.junit.Test;
import static org.junit.Assert.*;
public class DbTest {

    @Test
    public void hello(){

        DatabaseUtil db = new DatabaseUtil();
        db.disDBQuery();
        assertNotNull(db);

    }
}
