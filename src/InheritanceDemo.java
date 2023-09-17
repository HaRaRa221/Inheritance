import java.text.DecimalFormat;
import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> Employees = new ArrayList<>();

        double hoursWork[] = {40, 50, 40};

        Worker Jack = new Worker("000001", "Jack", "Ma", "Mr.", 1964, 40);
        Worker Drew = new Worker("000002", "Drew", "Mapper", "Mr.", 1986, 35);
        Worker Candy = new Worker("000003", "Candy", "Bagel", "Ms.", 1993, 33);

        Employees.add(Jack);
        Employees.add(Drew);
        Employees.add(Candy);

        SalaryWorker Sally = new SalaryWorker("000004", "Sally", "Forerunner", "Mrs.", 1980, 70000);
        SalaryWorker Barbara = new SalaryWorker("000005", "Barbara", "Walters", "Ms.", 1988, 65000);
        SalaryWorker Timmy = new SalaryWorker("000006", "Timmy", "Banks", "Mr.", 1985, 70000);

        Employees.add(Sally);
        Employees.add(Barbara);
        Employees.add(Timmy);

        double weeklyPay;

        DecimalFormat decimalFormat = new DecimalFormat("$#.00");

        System.out.println("Week\tWorker\t\tWeeklyPay");


        for (int i = 0; i < 32; i++)
        {
            System.out.print("*");
        }
        System.out.println();

        int quantity = 0;
        for (int i = 0; i < 3; i++)
        {
            quantity++;
            System.out.println(quantity);

            for(Worker labor: Employees) {
                weeklyPay = labor.calculateWeeklyPay(hoursWork[i]);


                System.out.println("\t" + "\t" + labor.getfName()+ "\t" + "\t" + decimalFormat.format(weeklyPay));

            }
        }

    }
}
