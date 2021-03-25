package Assignment_4;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {

    public static void main(String args[]) {

        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee("asda", 101));
        list.add(new Employee("asdaas", 102));
        list.add(new Employee("asdaf", 105));
        list.add(new Employee("a", 100));
        list.add(new Employee("asa", 103));

        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }

}

class Employee implements Comparable<Employee> {

    String name;
    int id;

    Employee(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Employee e) {
        if (e.name.length() > this.name.length())
            return -1;
        else if(e.name.length() < this.name.length())
            return 1;
        else
            return 0;
    }

    public String toString() {
        return name;
    }

}