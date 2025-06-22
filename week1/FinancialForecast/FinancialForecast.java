package FinancialForecast;

public class FinancialForecast {
    public static double calculateFutureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        } else {
            return (1 + rate) * calculateFutureValue(principal, rate, years - 1);
        }
    }

    public static void main(String[] args) {
        double principal = 10000.0;
        double rate = 0.05;
        int years = 5;

        double futureValue = calculateFutureValue(principal, rate, years);
        System.out.printf("Future value after %d years: ₹%.2f\n", years, futureValue);
    }
}
