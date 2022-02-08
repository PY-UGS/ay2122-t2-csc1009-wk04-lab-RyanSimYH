package Lab4;

import java.util.Scanner;

public class CalBMI {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        float weight = input.nextFloat();
        System.out.print("Enter height in inches: ");
        float height = input.nextFloat();
        BMI bmi = new BMI(weight,height);
        System.out.println("BMI is "+bmi.getBMI());
        System.out.print(bmi.getBMIGrade());

    }
}
