package DailyTask;

public class CloningDemo {

    public static void main(String args[]) throws CloneNotSupportedException {

        Emp e1 = new Emp();
        e1.name = "Jack";
        e1.id = 101;
        e1.c.companyName = "Google";

        Emp e2 = (Emp)e1.clone();

        System.out.println(e1);
        System.out.println(e2);

        e2.name = "John";
        e2.id = 102;
        e2.c.companyName = "Microsoft";

        System.out.println(e1);
        System.out.println(e2);

    }
}



class Emp implements Cloneable   {

    String name;
    int id;
    Company c = new Company();

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return name + ", " + id + ", " + c.companyName;
    }
}

class Company {
    String companyName = "";
}