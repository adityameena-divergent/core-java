//package DailyTask;
//
//import java.util.*;
//
//public class ComparatorDemo {
//
//    public static void main(String args[]) {
//
//        ArrayList<Student> list = new ArrayList<>();
//        list.add(new Student("abhishek sahu", 1001));
//        list.add(new Student("shyam", 1006));
//        list.add(new Student("john doe", 1003));
//        list.add(new Student("angela", 1009));
//        list.add(new Student("leon", 1002));
//
//        Iterator i = list.iterator();
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }
//
//        Collections.sort(list, new sortByRollNumber());
//
//        System.out.println();
//        Iterator i = list.iterator();
//        while(i.hasNext()) {
//            System.out.println(i.next());
//        }
//
//        Collections.sort(list, new sortByNameLength());
//
//        System.out.println();
//        Iterator i1 = list.iterator();
//        while(i1.hasNext()) {
//            System.out.println(i.next());
//        }
//
//    }
//}
//
//class sortByRollNumber implements Comparator<Student> {
//    public int compare(Student s1, Student s2) {
//        return s1.rollNumber - s2.rollNumber;
//    }
//}
//
//class sortByNameLength implements Comparator<Student> {
//    public int compare(Student s1, Student s2) {
//        return s1.name.length() - s2.name.length();
//    }
//}
//
//
//class Student {
//    String name;
//    int rollNumber;
//
//    Student(String name, int rollNumber) {
//        this.name = name;
//        this.rollNumber = rollNumber;
//    }
//
//    public String toString() {
//
//        return "[" + name + "," + rollNumber + "]";
//
//    }
//}