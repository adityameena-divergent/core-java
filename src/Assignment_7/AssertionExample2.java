package Assignment_7;

/**
 * Augmented Assertion
 */
public class AssertionExample2 {
    public static void main(String[] args) {

        int x = 2;
        assert(x == 8):"x is not 8";
        if(x == 8)
            System.out.println(x);

    }
}
