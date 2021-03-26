package Assignment_5;

public class InitializationBlock {

    {
        System.out.println("Instance block");
    }

    InitializationBlock() {
        System.out.println("constructor");
    }

    public static void main(String args[]) {

        InitializationBlock i = new InitializationBlock();

    }
}
