package Assignment_6;

import java.time.LocalDate;
import java.util.Objects;

final public class Inheritance {
    public static void main(String[] args) {

        Employee m = new Manager("abhi", LocalDate.now(), 20000.0);

        Manager m1 = new Manager("ram", LocalDate.now(), 25000.0);

        System.out.println(m);
        System.out.println(m.hashCode());
        System.out.println(m1);
        System.out.println(m1.hashCode());

        m.raiseSalary(7000.0);

        System.out.println(m);
    }
}


final class Manager extends Employee {

    private String name;
    private LocalDate hireDate;
    double salary;

    Manager(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.salary += bonus;
    }

}


/**
 * Employee class with overridden hashCode, equals & toString method
 */
class Employee {
    private String name;
    private LocalDate hireDate;
    private double salary;

    public Employee(String name, LocalDate hireDate, double salary) {
        hireDate = Objects.requireNonNull(hireDate);
        name = Objects.requireNonNull(name);
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
    }

    public void raiseSalary(double salary) {
        this.salary += salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getHireDate() {
        return this.hireDate;
    }

    @Override
    public String toString() {
        return "[ " + name + " | " + hireDate + " | " + salary + " ]";
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name) + Double.hashCode(salary) + Objects.hashCode(hireDate);
    }

    @Override
    public boolean equals(Object e) {

        if(!(e instanceof Employee))
            return false;

        Employee e1 = (Employee)e;

        if(e1 == null)
            return false;
        else if(this == e1)
            return true;
        else if(this.hashCode() == e1.hashCode())
            return true;
        else if(this.salary == e1.salary && this.name.equals(e1.name) && this.hireDate.equals(e1.hireDate))
            return true;
        else
            return false;
    }
}
