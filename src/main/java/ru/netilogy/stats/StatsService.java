package ru.netilogy.stats;

public class StatsService {

    //Сумма всех продаж

    public double totalSalesSum(double[] salesPerMonth) {
        double sum = 0;
        for (double iArray : salesPerMonth) sum += iArray;
        return sum;
    }

    // Средняя сумма продаж в месяц

    public double averageMonthlySales(double[] salesPerMonth) {
        double sum = 0;
        for (double iArray : salesPerMonth) sum += iArray;
        return sum / salesPerMonth.length;
    }

    // Номер месяца, в котором был пик продаж

    public double indexMonthOfMaxSales(double[] salesPerMonth) {
        double sumPerMonth = 0;
        int month = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (sumPerMonth <= salesPerMonth[i]) {
                sumPerMonth = salesPerMonth[i];
                month = i;
            }
        }
        return month + 1;
    }

    // Номер месяца, в котором был минимум продаж

    public double indexMonthOfMinSales(double[] salesPerMonth) {
        double sumPerMonth = salesPerMonth[0];
        int month = 0;
        for (int i = 0; i < salesPerMonth.length; i++) {
            if (salesPerMonth[i] <= sumPerMonth) {
                sumPerMonth = salesPerMonth[i];
                month = i;
            }
        }
        return month + 1;
    }

    // Кол-во месяцев, в которых продажи были ниже среднего

    public double numberOfMonthBelowAverageSales(double[] salesPerMonth) {
        double sum = 0;
        int month = 0;
        for (double iArray : salesPerMonth) sum += iArray;
        double averageSum = sum / salesPerMonth.length;
        for (double sumPerMonth : salesPerMonth) if (averageSum > sumPerMonth) month = month + 1;
        return month;
    }


    // Кол-во месяцев, в которых продажи были выше среднего

    public double numberOfMonthAboveAverageSales(double[] salesPerMonth) {
        double sum = 0;
        int month = 0;
        for (double iArray : salesPerMonth) sum += iArray;
        double averageSum = sum / salesPerMonth.length;
        for (double sumPerMonth : salesPerMonth) if (averageSum < sumPerMonth) month = month + 1;
        return month;
    }
}

