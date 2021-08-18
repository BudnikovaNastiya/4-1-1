package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldAskToAdd500() {
        int amount = 500;
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(amount);

        Assert.assertEquals(500, expected);

    }

    @Test
    public void shouldNotAskToAdd() {
        int amount = 1000;
        CashbackHackService service = new CashbackHackService();
        int expected = service.remain(amount);

        Assert.assertEquals(0, expected);

    }
}
