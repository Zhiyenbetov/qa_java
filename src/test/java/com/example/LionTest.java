package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Test
    public void getFood() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");

        Lion lion = new Lion("Самец");

        List<String> actual = lion.getFood();

        assertEquals(expected, actual);
    }

    @Test
    public void getKittens() throws Exception {
        Lion lion = new Lion("Самец");

        int actual = lion.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void lionInvalidSexTest() throws Exception {
        new Lion("asd");
    }

}