package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long counter = 0;
        for (long sale : sales) {
            counter += sale;
        }
        return counter;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public long maximum(long[] sales) {
        int maximumMounth = 0;
        long maximumSales = sales[0];

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maximumSales) {
                maximumSales = sales[i];
                maximumMounth = i;
            }
        }
        return maximumMounth + 1;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long lessThanAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public long aboveAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}

