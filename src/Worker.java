

public class Worker extends Person {
    private double hourlyPayRate = 0;

    public Worker (String ID, String fName, String lName, String title, Integer YoB, double hourlyPayRate) {
        super(ID, fName, lName, title, YoB);
        this.hourlyPayRate = hourlyPayRate;

    }

    public Worker(String ID, String fName, String lName, String title, int YOB) {
        super(ID, fName, lName, title, YOB);
    }

    public double getHourlyPayRate()
    {
        return hourlyPayRate;
    }

    public void setHourlyPayRate(double hourlyPayRate)
    {
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay (double hoursWorked)
    {
        double payRegular = 0;
        double payOvertime = 0;
        double payTotal = 0;

        if (hoursWorked <= 40)
        {
            payRegular = hoursWorked * hourlyPayRate;
        }
        else {
            payOvertime = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            payRegular = 40 * hourlyPayRate;
        }
        return payTotal = payRegular * payOvertime;
    }

    public String displayWeeklyPay(double hoursWorked)
    {
        double payRegular = 0;
        double payOvertime = 0;
        double payTotal = 0;

        String retString = "";
        if(hoursWorked > 40) {
            payOvertime = (hoursWorked - 40) * (hourlyPayRate * 1.5);
            payRegular = 40 * hourlyPayRate;
        }
        else {
            payRegular = hoursWorked * hourlyPayRate;
        }
        payTotal = payRegular + payOvertime;

        retString = "Regular Pay =" + " " + String.format("$%.2f\n", payRegular);
        retString = "Overtime Pay =" + " " + String.format("$%.2f\n", payOvertime);
        retString = "Total Pay =" + " " + String.format("$%.2f\n", payTotal);

        return retString;
    }
}
