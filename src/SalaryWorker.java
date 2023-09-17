public class SalaryWorker extends Worker{
    private double yearlySalary;

    public double getYearlySalary() {
        return yearlySalary;
    }
    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public SalaryWorker(String ID, String fName, String lName, String title, int YOB,double yearlySalary) {
        super(ID, fName, lName, title, YOB);
        this.yearlySalary = yearlySalary;
    }

    @Override
    public double calculateWeeklyPay(double hoursWorked)
    {
        return yearlySalary / 52;
    }
    @Override
    public String displayWeeklyPay (double hoursWorked)
    {
        double payTotal = yearlySalary/52;

        String retString = "";

        retString = "Weekly pay is only a fraction of the salary of the year";
        retString = "Weekly Pay =" + " " + String.format("$%.2f\n", payTotal);
        retString = "Annual Pay =" + " " + String.format("$%.2f\n", yearlySalary);

        return retString;
    }
}
