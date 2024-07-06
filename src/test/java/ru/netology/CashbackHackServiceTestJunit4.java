package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTestJunit4 {

    @Test
    public void shouldReturn100IfAmountIs900() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int expected = 100;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
    @Test
    public void shouldReturn0IfAmountIs1000(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;

        int actual = service.remain(amount);

        assertEquals(expected, actual);
    }
}