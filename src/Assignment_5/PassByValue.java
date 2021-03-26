// Is Java pass by value or pass by reference, prove using a program?
// It is pass by value.

package Assignment_5;

public class PassByValue {

    String name;

    public static void main(String args[]) {


        PassByValue p = new PassByValue();
        p.name = "Hello";
        System.out.println(p.name);

        setValue(p);
        System.out.println(p.name);

    }

    public static void setValue(PassByValue p) {
        p = new PassByValue();
        p.name = "Welcome";
    }
}
