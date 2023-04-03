package ru.netology.stats;

public class StatsService {

    public int getSumSales(int[] sales) {
        int sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];
        }
//      System.out.println("Сумма всех продаж: " + sumSales);
        return sumSales;
    }

    public int getMeanSales(int[] sales) {
        int sumSales = getSumSales(sales);
        int meanSales = 0;
        meanSales = sumSales / sales.length;
//        System.out.println("Средняя сумма продаж в месяц: " + meanSales);
        return meanSales;
    }

    public int getMinSales(int[] sales) {
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[minSales]) {
                minSales = i;
            }
        }
        minSales = minSales + 1;
//        System.out.println("Номер (первого) месяца, в котором был минимум продаж: " + minSales);
        return minSales;
    }

    public int getMaxSales(int[] sales) {
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxSales]) {
                maxSales = i;
            }
        }
        maxSales = maxSales + 1;
//        System.out.println("Номер (первого) месяца, в котором был максимум продаж: " + maxSales);
        return (maxSales);
    }

    public int getLastMonthLessMeanSales(int[] sales) {
        int meanSales = getMeanSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < meanSales) {
                count++;
            }
        }
//        System.out.println("Количество месяцев, в которых продажи были ниже среднего: " + count);
        return count;
    }

    public int getLastNumberMonthLessMeanSales(int[] sales) {
        int meanSales = getMeanSales(sales);
        int minSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < meanSales) {
                minSales = i;
            }
        }
        minSales = minSales + 1;
//        System.out.println("Последний месяц, в котором продажи были ниже среднего: " + minSales);
        return minSales;
    }

    public int getLastMonthMoreMeanSales(int[] sales) {
        //int sumSales = 0;
        int meanSales = getMeanSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > meanSales) {
                count++;
            }
        }
//        System.out.println("Количество месяцев, в которых продажи были выше среднего: " + count);
        return count;
    }

    public int getLastNumberMonthMoreMeanSales(int[] sales) {
        //int sumSales = 0;
        int meanSales = getMeanSales(sales);
        int maxSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > meanSales) {
                maxSales = i;
            }
        }
        maxSales = maxSales + 1;
//        System.out.println("Последний месяц, в котором продажи были выше среднего: " + maxSales);
        return maxSales;
    }

}

