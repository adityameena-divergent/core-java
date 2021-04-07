//package Assignment_5;
//
//import java.time.LocalDate;
//import java.util.Arrays;
//import java.util.Objects;
//
//public class EmployeeDemo {
//
//    public static void main(String args[]) {
//
//        Employee employee[] = new Employee[5];
//
//        employee[0] = Employee.getInstance("Harry", LocalDate.of(2020, 5, 13), 2000);
//        employee[1] = Employee.getInstance("Jake", LocalDate.of(2019, 11, 20), 5000);
//        employee[2] = Employee.getInstance("Michal", LocalDate.of(2010, 1, 5), 7000);
//        employee[3] = Employee.getInstance("James", LocalDate.of(2012, 7, 27), 4000);
//        employee[4] = Employee.getInstance("Tom", LocalDate.of(2016, 9, 23), 6000);
//
//
//        for (var e: employee) {
//            System.out.println(e);
//        }
//
//        var e = Employee.getInstance("Tom", LocalDate.of(2016, 9, 23), 6000);
//
//        System.out.println(e.equals(employee[4]));
//        System.out.println(e.equals(null));
//
//        System.out.println(e.hashCode());
//        System.out.println(employee[4].hashCode());
//
//    }
//}
//
//
//class Employee {
//    private String name;
//    private LocalDate hireDate;
//    private double salary;
//
//    private Employee(String name, LocalDate hireDate, double salary) {
//        hireDate = Objects.requireNonNull(hireDate);
//        name = Objects.requireNonNull(name);
//        this.name = name;
//        this.hireDate = hireDate;
//        this.salary = salary;
//    }
//
//    static Employee getInstance(String name, LocalDate hireDate, double salary) {
//        return new Employee(name, hireDate, salary);
//    }
//
//    @Override
//    public String toString() {
//        return "[ " + name + " | " + hireDate + " | " + salary + " ]";
//    }
//
//    @Override
//    public int hashCode() {
//        /*
//        int hash = 0;
//
//        for(int i = 0; i < this.name.length(); i++) {
//            hash = 7 * hash + this.name.charAt(i);
//        }
//
//        hash = 7 * hash + this.hireDate.getDayOfMonth();
//        hash = 7 * hash + this.hireDate.getDayOfYear();
//        return hash;
//        */
//
//        return Objects.hashCode(name) + Double.hashCode(salary) + Objects.hashCode(hireDate);
//    }
//
//    @Override
//    public boolean equals(Object e) {
//
//        if(!(e instanceof Employee))
//            return false;
//
//        Employee e1 = (Employee)e;
//
//        if(e1 == null)
//            return false;
//        else if(this == e1)
//            return true;
//        else if(this.hashCode() == e1.hashCode())
//            return true;
//        else if(this.salary == e1.salary && this.name.equals(e1.name) && this.hireDate.equals(e1.hireDate))
//            return true;
//        else
//            return false;
//    }
//}