package Assignment_6;

public class AbstractClass {

    public static void main(String[] args) {

    }

    abstract class Person {
        private String name;

        Person(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }
    }

    class Employee extends Person {

        private double salary;

        public Employee(String name, double salary) {
            super(name);
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + getName() + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }

    class Student extends Person {

        private String studentMajoring;

        public Student(String name, String studentMajoring) {
            super(name);
            this.studentMajoring = studentMajoring;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + getName() + '\'' +
                    ", studentMajoring='" + studentMajoring + '\'' +
                    '}';
        }
    }



}
