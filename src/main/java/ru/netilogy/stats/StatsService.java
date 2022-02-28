package ru.netilogy.stats;

public class StatsService {

    //Сумма всех продаж

    public double totalSalesSum(double[] salesPerMonth) {
        double sumTotal = 0;
        for (double monthlySales : salesPerMonth) {
            sumTotal += monthlySales;
        }
        return sumTotal;
    }

    // Средняя сумма продаж в месяц

    public double averageMonthlySales(double[] salesPerMonth) {
        double sumAverage = totalSalesSum(salesPerMonth);
        return sumAverage / salesPerMonth.length;
    }

    // Номер месяца, в котором был пик продаж

    public double indexMonthOfMaxSales(double[] salesPerMonth) {
        double sumPerMonth = 0;
        int monthMax = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (sumPerMonth <= salesPerMonth[i]) {
                sumPerMonth = salesPerMonth[i];
                monthMax = i;
            }
        }
        return monthMax + 1;
    }

    // Номер месяца, в котором был минимум продаж

    public double indexMonthOfMinSales(double[] salesPerMonth) {
        double sumPerMonth = salesPerMonth[0];
        int monthMin = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] <= sumPerMonth) {
                sumPerMonth = salesPerMonth[i];
                monthMin = i;
            }
        }
        return monthMin + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего

    public double numberOfMonthBelowAverageSales(double[] salesPerMonth) {
        int monthBelowAverageSales = 0;
        double averageSum = averageMonthlySales(salesPerMonth);
        for (double sumPerMonth : salesPerMonth) {
            if (averageSum > sumPerMonth) monthBelowAverageSales = monthBelowAverageSales + 1;
        }
        return monthBelowAverageSales;
    }


    // Кол-во месяцев, в которых продажи были выше среднего

    public double numberOfMonthAboveAverageSales(double[] salesPerMonth) {
        int monthAboveAverageSales = 0;
        double averageSum = averageMonthlySales(salesPerMonth);
        for (double sumPerMonth : salesPerMonth)
            if (averageSum < sumPerMonth) monthAboveAverageSales = monthAboveAverageSales + 1;
        return monthAboveAverageSales;
    }
}

