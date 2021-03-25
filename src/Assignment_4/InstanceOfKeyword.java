package Assignment_4;

public class InstanceOfKeyword {

    public static void main(String args[]) {

        A a = new B();
        System.out.println(a instanceof B);
        System.out.println(a instanceof A);
        System.out.println(a instanceof InstanceOfKeyword);

    }
}

interface A {
    void show();
}


class B implements A {
    public void show() {
        System.out.println("Class B");
    }
}