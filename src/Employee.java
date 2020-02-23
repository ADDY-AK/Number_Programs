//salary and working hours program

import java.util.Scanner;

public class Employee {
    double salary, hours;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e = new Employee();
        e.getInfo(sc.nextDouble(), sc.nextDouble());
    }

    void getInfo(double salary, double hours) {
        if (salary < 500 && hours > 6) {
            System.out.println(salary + 15);
        } else if (salary < 500) {
            System.out.println(AddSal(salary));
        } else if (hours > 6) {
            System.out.println(AddWork(salary));
        } else {
            System.out.println(salary);
        }
    }

    double AddSal(double salary) {
        return salary + 10;
    }

    double AddWork(double salary) {
        return salary + 5;
    }
}

