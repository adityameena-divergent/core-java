package Assignment_4;


public class InterfaceDemo {

    public static void main(String args[]) {

        Demo i = new Demo();
        i.show();
        Inter3.staticMethod();
    }
}

class Demo implements Inter1, Inter2 {

}

interface Inter3 {
    default void show() {
        System.out.println("Inter 3");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("Private");
    }

    static void staticMethod() {

        System.out.println("Static Inter 3");
    }
}

interface Inter1 extends Inter3 {
//    default void show() {
//        System.out.println("Inter 1");
//    }
}
interface Inter2 extends Inter3{
//    default void show() {
//        System.out.println("Inter 2");
//    }
}
