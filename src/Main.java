public class Main {
    public static void main(String[] args)
    {
        double initalBalance = 2500;
        double annualInterestRate = 0.17;
        double monthlyInterestRate = annualInterestRate / 12;

        double intAfterMonthOne = initalBalance * monthlyInterestRate;
        double intAfterMonthTwo = initalBalance + intAfterMonthOne + monthlyInterestRate;

        System.out.println("Your interest rate after one month: $ " + intAfterMonthOne);
        System.out.println("Your interest rate after two months: $ " + intAfterMonthTwo);
    }
}