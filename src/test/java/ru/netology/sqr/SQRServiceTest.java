package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @Test
    void shouldborder() {
        SQRService service = new SQRService();
        int lowLimit = 200;
        int highLimit = 300;
        int expected = 3;

        int actual = service.border(lowLimit, highLimit);

        assertEquals(expected, actual);
    }
}