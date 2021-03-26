
// What are the different default values assigned to different types of instance variable of a class,
// prove using a program, by printing values.

package Assignment_5;

public class DefaultValueOfDifferentDataType {

    String name;
    int n;
    double d;
    boolean b;
    char c;

    public static void main(String args[]) {

        DefaultValueOfDifferentDataType d = new DefaultValueOfDifferentDataType();
        System.out.println(d.name);
        System.out.println(d.n);
        System.out.println(d.d);
        System.out.println(d.b);
        System.out.println(d.c);

    }
}
