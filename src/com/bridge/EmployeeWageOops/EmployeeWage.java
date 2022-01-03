package com.bridge.EmployeeWageOops;

import java.util.Scanner;

public class EmployeeWage {
    public static final int EMPLOYEE_WAGE_PER_HOUR = 20;
    public static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage Computation Program");
        double random = Math.random() * 2;
        System.out.println("random number generated is : " + random);
        int result = (int) random % 2;
        System.out.println("result is :" + result);
        if (result == 1)
            System.out.println("Employee is present");
        else {
            System.out.println("Employee is absent");
        }

        UC2();
        UC3();
        UC4();
        UC5();
    }

    private static int UC2() {
        int dailyWage = EMPLOYEE_WAGE_PER_HOUR * FULL_DAY_HOUR;
        System.out.println("Daily employee wage is :" + dailyWage);
        return dailyWage;
    }

    static void UC3() {
        Employee partTimeEmployee = new Employee();
        partTimeEmployee.jobType = "part Time";
        partTimeEmployee.wage = 15;
        partTimeEmployee.numberOfHours = 8;
        partTimeEmployee.totalWage = partTimeEmployee.numberOfHours * partTimeEmployee.wage;
        System.out.println("Total part time Wage: " + partTimeEmployee.totalWage);

    }

    static void UC4() {
        System.out.println("Press 1 to see Daily employee wage / Full time Wage ");
        System.out.println("Press 2 for full time emp ");

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1:
                UC2();
                break;
            case 2:
                UC3();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }

    static void UC5(){
        int workingDaysOfMonth = 20;
        int Wageformonth = workingDaysOfMonth * UC2();
        System.out.println("Employee wage for a month is:"+ Wageformonth);
    }
}
