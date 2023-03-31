package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void shouSumSales() {
        StatsService service = new StatsService();
        int expectedSales = 180;
        int actualSales = service.getSumSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouMeanSales() {
        StatsService service = new StatsService();
        int expectedSales = 15;
        int actualSales = service.getMeanSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouMinSales() {
        StatsService service = new StatsService();
        int expectedSales = 9;
        int actualSales = service.getMinSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouMaxSales() {
        StatsService service = new StatsService();
        int expectedSales = 6;
        int actualSales = service.getMaxSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouLastMonthLessMeanSales() {
        StatsService service = new StatsService();
        int expectedSales = 5;
        int actualSales = service.getLastMonthLessMeanSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void shouLastNumberMonthLessMeanSales() {
        StatsService service = new StatsService();
        int expectedSales = 11;
        int actualSales = service.getLastNumberMonthLessMeanSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void getLastMonthMoreMeanSales() {
        StatsService service = new StatsService();
        int expectedSales = 5;
        int actualSales = service.getLastMonthMoreMeanSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

    @Test
    public void getLastNumberMonthMoreMeanSales() {
        StatsService service = new StatsService();
        int expectedSales = 12;
        int actualSales = service.getLastNumberMonthMoreMeanSales(sales);
        Assertions.assertEquals(expectedSales, actualSales);
    }

}