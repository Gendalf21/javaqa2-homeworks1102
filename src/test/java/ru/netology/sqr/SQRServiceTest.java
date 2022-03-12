package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldborder() {
        SQRService service = new SQRService();
        int lowLimit = 100;
        int highLimit = 400;
        int expected = 11;

        int actual = service.borderMethod(lowLimit, highLimit);

        assertEquals(expected, actual);
    }
}