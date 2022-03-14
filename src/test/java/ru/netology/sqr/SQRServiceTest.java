package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {
    @Test
    public void shouldChangeHighBorder() {
        SQRService service = new SQRService();
        int lowLimit = 300;
        int highLimit = 400;
        int expected = 3;
        int actual = service.borderMethod(lowLimit, highLimit);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChangeLowBorder() {
        SQRService service = new SQRService();
        int lowLimit = 100;
        int highLimit = 200;
        int expected = 5;
        int actual = service.borderMethod(lowLimit, highLimit);
        Assertions.assertEquals(expected, actual);
    }
}