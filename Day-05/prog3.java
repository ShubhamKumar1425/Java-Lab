import java.util.*;

interface Salary {
    double earnings(double basic);

    double deductions(double basic);

    double bonus(double basic);
}

class Manager implements Salary {

    public double earnings(double basic) {
        return basic + 0.8 * basic + 0.15 * basic;
    }

    public double deductions(double basic) {
        return 0.12 * basic;
    }

    public double bonus(double basic) {
        // This method is not implemented for Manager
        return 0;
    }
}

class Substaff extends Manager {

    public double bonus(double basic) {
        return 0.5 * basic;
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff();
        System.out.println("Earnings - " + substaff.earnings(basicSalary));
        System.out.println("Deduction - " + substaff.deductions(basicSalary));
        System.out.println("Bonus - " + substaff.bonus(basicSalary));
    }
}
