package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaDemos {
    public static void main(String[] args) {
        // Using anonymous class
        Greeting greeting1 = new Greetings();
        greeting1.greet();

        // Using lambda expression
        Greeting greeting2 = () -> System.out.println("Hello from Lambda Expression!");
        greeting2.greet();

        String og = "aba";

        StringProcessor rev = str -> new StringBuilder(str).reverse().toString();

        StringProcessor isPalindrome = (String og1) -> new StringBuilder(og).reverse().toString();

        System.out.println(rev.process("aba"));
        System.out.println("Is '" + og + "' a palindrome? " + isPalindrome.process(rev.toString()).equalsIgnoreCase(og));

        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        Comparator<Integer> ascendingOrder = (a, b) -> a - b;
        Collections.sort(numbers, ascendingOrder);
        System.out.println("Sorted numbers: asc " + numbers);

        Comparator<Integer> descOrder = (a, b) -> b - a;
        Collections.sort(numbers, descOrder);
        System.out.println("Sorted numbers: desc " + numbers);

        // Arrays.asList is for strings and classes and List.of is for integers
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        Collections.sort(strings, (str1, str2) -> str2.compareTo(str1));
        System.out.println("Sorted Strings: desc on the basis of first character of the string " + strings);

        Predicate<Integer> isEven = num -> num % 2 == 0;
        System.out.println("Is 4 even? " + isEven.test(4));
        System.out.println("Is 7 even? " + isEven.test(7));


        Predicate<String> isPalindrome1 = (String str)->
            new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);
        
        System.out.println("Is 'madam' a palindrome? " + isPalindrome1.test("madam"));

        List<Integer> nums = Arrays.asList(10, -15, -20, 2, -5, -30, -35, 40);

        Predicate<Integer> checkPositive = (n) -> n>0;

        for (Integer integer : nums) {
            System.out.println(integer + " is positive? " + checkPositive.test(integer));
        }

        // function can take any type and return any type
        // the first type parameter is the input type and the second type parameter is the return type
        Function<Integer, Double> sqrtFunction = (n) -> Math.sqrt(n);
        System.out.println("Square root of 16 is: " + sqrtFunction.apply(16));

        Function<String, String> firstName = (f) -> f.split(" ")[0];
        System.out.println("First name of 'John Doe' is: " + firstName.apply("John Doe"));

        List<String> names = Arrays.asList("John Doe", "Jane Smith", "Alice Johnson");
        for (String string : names) {
            System.out.println("First name: " + firstName.apply(string));
        }

        Consumer<String> printConsumer = (msg) -> {
            System.out.println("Message: " + msg);
        };

        printConsumer.accept("Hello, World!");

        List<String> fruits = Arrays.asList("apple", "banana", "cherry");
        fruits.forEach(f -> System.out.println("Fruit: " + f)); // forEach method takes a Consumer functional interface
        
    }
}

//notes:
/*
 * lambda expressions is introduced to implement(give_body) single abstract method of functional interfaces
*/

