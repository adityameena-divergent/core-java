package Assignment_7;

public class UpCastingDownCasting {
    public static void main(String[] args) {

        A a = new B(); // Upcasting

        B b = (B)a; // Downcasting

    }
}

class A {

}

class B extends A{

}