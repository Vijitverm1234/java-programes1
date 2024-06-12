import java.util.ArrayList;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(13);
        numbers.add(15);
        numbers.add(16);
        numbers.add(17);
        System.out.println("with the help of Lambda Expression ");
        numbers.forEach((n) -> {
            System.out.println("number " + n);
        });
        System.out.println("with the help of Memory references");
        numbers.forEach(System.out::println);
    }
}
/*
 * Lambda Expressions were added in Java 8.
 * A lambda expression is a short block of code which takes in parameters and
 * returns a value. Lambda expressions are similar to methods, but they do not
 * need a name and they can be implemented right in the body of a method.
 * 
 */
