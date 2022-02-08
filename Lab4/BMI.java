package Lab4;

public class BMI {
    private float weight;
    private float height;
    private double BMI;
    private String grade;
    private final double lbConverter = 0.45359237;
    private final double inConverter = 0.0254;

    public BMI(float weight, float height)
    {
        this.weight = weight;
        this.height = height;
    }

    public double getBMI()
    {
        this.BMI = (weight*lbConverter)/((height*inConverter)*(height*inConverter));
        return this.BMI;
    }

    public String getBMIGrade()
    {
        if(this.BMI < 18.5)
        {
            this.grade = "Underweight";
        }
        else if (this.BMI >=18.5 &&this.BMI < 25)
        {
            this.grade = "Normal";
        }
        else if ( this.BMI >=25 && this.BMI < 30)
        {
            this.grade = "Overweight";
        }
        else
        {
            this.grade = "Obese";
        }
        return this.grade;
    }

}
