package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackServiceTest {
    CashbackService service = new CashbackService();

    @Test
    public void shouldRemainAmount1000() {
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAmount0() {
        int actual = service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAmount2100() {
        int actual = service.remain(2100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAmount999() {
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainAmountInCorrect() {
        int actual = service.remain(-1);
        assertThrows(RuntimeException.class, () -> {service.remain(-1);});
    }
}