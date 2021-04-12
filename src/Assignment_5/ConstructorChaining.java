package Assignment_5;

public class ConstructorChaining {

    public static void main(String[] args) {
        B b = new B();
    }

}

class A {
    A() {
        this("A");
        System.out.println("Class A Default Constructor");

    }
    A(String s) {
        System.out.println("Class A Paramiterized Constructor");
    }
}

class B extends A {
    B() {
        super();
        System.out.println("Class B Default Constructor");
    }

}