package Assignment_5;

public class ConstructorOverloading {

    public ConstructorOverloading() {
        System.out.println("Zero Parameter Constructor");
    }

    public ConstructorOverloading(int x) {
        System.out.println("One Parameter Constructor");
    }

    public ConstructorOverloading(int x, int y) {
        System.out.println("Two Parameter Constructor");
    }

    public static void main(String args[]) {

        ConstructorOverloading c1 = new ConstructorOverloading();
        ConstructorOverloading c2 = new ConstructorOverloading(10);
        ConstructorOverloading c3 = new ConstructorOverloading(10,20);

    }
}
