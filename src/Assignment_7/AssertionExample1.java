package Assignment_7;

/**
 * Simple Assertion
 *
 * Run :- java -ea AssertionExample
 * or  :- java -enableassertions AssertionExample
 */
public class AssertionExample1 {
    public static void main(String[] args) {
        int x = 9;
        assert(x == 8);
        if(x == 8) {
            System.out.println(x);
        }
    }
}