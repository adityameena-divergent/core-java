package Assignment_1;/*
* 1. What is the difference between JDK and JRE?
* JDK is java development kit which provide javac(compiler), etc
* JRE is java run time environment, JRE contain JVM
*
*
*
* 2. What is Java Virtual Machine (JVM)?
* Java Virtual Machine is interpreter for bytecode, that run java byte code.
*
*
*
* 3. What are the different types of memory areas allocated by JVM?
* Heap, Stack, Register,
*
*
*
* 4. What is JIT compiler?
* JIT(Just In Time) is a part of JVM, that select portions of byte code and compile into executable code, piece by piece.
*
*
*
* 5. How Java platform is different from other platforms?
* Because it is platform independent. It can be used for different applications.
*
*
*
*
* 6. Why people say that Java is 'write once and run anywhere' language?
* Java convert its high level code into byte code, that can be execute in any other platform.
*
*
*
*
* 7. What are primitive data types?
* There are 8 primitive type in java :-
* byte, short, int, long, float, double, char, boolean
*
*
*
*
* 8. Why it is not preferred to use float and double in financial applications, write a program to describe the issue.
* float gives up to 6-7 precision and double gives up to 15 precision, and in financial application we did not use more than 1 or 2 precision, if it gives more precision than after calculation the result might be different.
*
*
*
* 9. If a variable of primitive data type is not assigned, what does it contain?
* In case of instance variable the default will be 0 for (byte, short, int, long), 0.0 for (float, double), false for boolean, and '' for char.
* The value of local and static variable are blank, they does'nt have any default value.
*
*
*
*
*10. Why do we suffix L with long, F with Float and D with double?
* By default it gives (byte,short,int,long) as int and (float,double) as double. With suffix L it gives long instead of int and with F it gives float instead of double
* example:-
*
* byte x = 10;
* byte y = 20;
*
*
*
*
*
*
*
* 11. What happens when you assign a variable of primitive data type to another variable of same type?
*  The new variable creates a separate copy of variable.
*
*
*
* 12. What are reference data types?
* All wrapper class are reference data types.
* e.g. Integer, Float, Character
*
*
*
*
* */

public class DataTypes {
    public static void main(String args[]) {



//        Print "\u0022+\u0022" through code and explain the behaviour

//        int ch = '\u0022';
//        Hexadecimal unicode character of "
//        unicode number of " is 34
//        System.out.println(ch + ch);



//        char ch = '\u0010';

//        System.out.printf("%H",ch);

    }
}
