public class Excercise_7 {

    public static double futureValue(double amount, double rate, int years) {

        if (years == 0)
            return amount;

        return futureValue(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        double initialAmount = 10000;
        double growthRate = 0.10;
        int years = 5;

        double future = futureValue(initialAmount, growthRate, years);

        System.out.printf("Future Value after %d years = %.2f%n",
                years, future);
    }
}