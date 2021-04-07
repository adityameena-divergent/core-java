package Assignment_4;

import java.util.Arrays;

public class DeepCloning {

    public static void main(String args[]) throws CloneNotSupportedException {

        Emp e1 = new Emp();
        e1.name = "Jack";
        e1.id = 101;
        e1.c.companyName = "Google";

        Emp e2 = (Emp)e1.clone();

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

        e2.name = "John";
        e2.id = 102;
        e2.c.companyName = "Microsoft";

        System.out.println(e1.hashCode());
        System.out.println(e2.hashCode());

    }
}



class Emp implements Cloneable   {

    String name;
    int id;
    Company c = new Company();

    public Object clone() throws CloneNotSupportedException {
        Emp e = (Emp)super.clone();
        e.c = new Company();
        e.c.companyName = c.companyName;
        return e;
    }

    @Override
    public String toString() {
        return "[ Name : " + name + ", Id : " + id + ", Company Name : " + c.companyName + " ]";
    }

    @Override
    public int hashCode() {
        int hash = 0;
        for(int i = 0; i < this.name.length(); i++) {
            hash = 7 * hash + this.name.charAt(i);
        }
        hash = 7 * hash + id;
        return hash;

//        int hash = 0;
//        hash = 10 * hash + Arrays.hashCode(this.name.toCharArray());
//        hash = 10 * hash + id;
//        return hash;
    }

}

class Company {
    String companyName;
}