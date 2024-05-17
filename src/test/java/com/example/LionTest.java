package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getFood() throws Exception {
        List<String> food = List.of("Животные", "Птицы", "Рыба");

        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(food);

        List<String> actual = lion.getFood();

        assertEquals(food, actual);
    }

    @Test
    public void getKittens() {
        Lion lion = new Lion(feline);

        Mockito.when(feline.getKittens()).thenReturn(1);

        int actual = lion.getKittens();
        int expected = 1;

        assertEquals(expected, actual);
    }

    @Test(expected = Exception.class)
    public void lionInvalidSexTest() throws Exception {
        new Lion("asd");
    }

}