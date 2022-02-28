package ru.netilogy.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    double[] salesPerMonth = {200, 300, 300.5, 400, 500, 550, 400, 350, 200, 350, 350, 550.5};     // Тестовые данные

    @Test
    void test_totalSalesSum() {
        double expected = 4451;
        StatsService service = new StatsService();
        double actual = service.totalSalesSum(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void test_averageMonthlySales() {
        double expected = 370.9166666666667;
        StatsService service = new StatsService();
        double actual = service.averageMonthlySales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void test_indexMonthOfMaxSales() {
        double expected = 12;
        StatsService service = new StatsService();
        double actual = service.indexMonthOfMaxSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void test_indexMonthOfMinSales() {
        double expected = 9;
        StatsService service = new StatsService();
        double actual = service.indexMonthOfMinSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void test_numberOfMonthBelowAverageSales() {
        double expected = 7;
        StatsService service = new StatsService();
        double actual = service.numberOfMonthBelowAverageSales(salesPerMonth);
        assertEquals(expected, actual);
    }

    @Test
    void test_numberOfMonthAboveAverageSales() {
        double expected = 5;
        StatsService service = new StatsService();
        double actual = service.numberOfMonthAboveAverageSales(salesPerMonth);
        assertEquals(expected, actual);
    }
}