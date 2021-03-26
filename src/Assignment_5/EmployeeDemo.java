package Assignment_5;

import java.time.LocalDate;
import java.util.Objects;

public class EmployeeDemo {

    public static void main(String args[]) {

        Employee employee[] = new Employee[5];

        employee[0] = Employee.getInstance("Harry", LocalDate.of(2020, 5, 13), 2000);
        employee[1] = Employee.getInstance("Jake", LocalDate.of(2019, 11, 20), 5000);
        employee[2] = Employee.getInstance("Michal", LocalDate.of(2010, 1, 5), 7000);
        employee[3] = Employee.getInstance("James", LocalDate.of(2012, 7, 27), 4000);
        employee[4] = Employee.getInstance("Tom", LocalDate.of(2016, 9, 23), 6000);


        for (Employee e: employee) {
            System.out.println(e);
        }

        Employee e = Employee.getInstance("Tom", LocalDate.of(2016, 9, 23), 6000);

        System.out.println(e.equals(employee[4]));

    }
}


class Employee {
    private String name;
    private LocalDate hireDate;
    private double salary;

    private Employee(String name, LocalDate hireDate, double salary) {
        hireDate = Objects.requireNonNull(hireDate);
        name = Objects.requireNonNull(name);
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    static Employee getInstance(String name, LocalDate hireDate, double salary) {
        return new Employee(name, hireDate, salary);
    }

    public String toString() {
        return name + " | " + hireDate + " | " + salary;
    }

    public boolean equals(Employee e) {
        return name.equals(e.name);
    }
}