package Lab3;

import java.util.Date;

public class Loan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;

    public Loan()
    {

    }

    public Loan(double annualInterestRate, int numberOfYears, double loanAmount)
    {
        this.annualInterestRate = annualInterestRate;
        this.numberOfYears = numberOfYears;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
    }

    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears()
    {
        return numberOfYears;
    }

    public Date getLoanDate()
    {
        return loanDate;
    }

    public void setNumberOfYears(int numberOfYears)
    {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount()
    {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount)
    {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment()
    {
         double monthlyInterest;
         double monthlyPayment;
         monthlyInterest = (annualInterestRate/100)/12;
         monthlyPayment = (loanAmount * monthlyInterest)/(1-(1/(Math.pow((1+monthlyInterest),numberOfYears*12))));
         return monthlyPayment;

    }

    public double getTotalPayment()
    {
        double totalPayment;
        totalPayment = (getMonthlyPayment()*numberOfYears*12);
        return totalPayment;
    }
}
