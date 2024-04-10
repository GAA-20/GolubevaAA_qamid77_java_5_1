package ru.netology.services;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class HolidayCalcServiceTest {

    @Test
    public void shouldCalculateHolidayForCase1() {
        HolidayCalcService service = new HolidayCalcService();

        // подготавливаем данные:
        int income = 10;
        int expenses = 3;
        int threshold = 20;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalculateHolidayForCase2() {
        HolidayCalcService service = new HolidayCalcService();

        // подготавливаем данные:
        int income = 100;
        int expenses = 60;
        int threshold = 150;
        int expected = 2;

        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }
}
