package ru.netology.sqr;

public class SQRService {

    public int border(int lowLimit, int highLimit) {
        int counter = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowLimit && i * i <= highLimit) {
                counter++;
            }
        }
        return counter;
    }
}
