package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionParameterizedTest {

    String sex;
    boolean expectedHasMane;


    public LionParameterizedTest(String sex, boolean hasMane){
        this.sex = sex;
        this.expectedHasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[] LionSex() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }
    @Test
    public void hasManeTest() throws Exception {
        Lion lion = new Lion(new Feline(), sex);
        assertEquals(lion.doesHaveMane(), expectedHasMane);
    }

}