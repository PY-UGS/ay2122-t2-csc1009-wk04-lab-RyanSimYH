package Lab3;

import java.util.Scanner;

public class LoanCalculator {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter annual interest rate, for example, 8.25: ");
        double annualInterest = input.nextDouble();
        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();
        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmount = input.nextDouble();

        Loan userloan = new Loan(annualInterest,years,loanAmount);
        System.out.println("The loan was created on "+userloan.getLoanDate());
        System.out.println(String.format("The monthly payment is %.2f",userloan.getMonthlyPayment()));
        System.out.println(String.format("The total payment is %.2f",userloan.getTotalPayment()));


    }
}
