import java.util.InputMismatchException;
import java.util.Scanner;
class InvalidNumeratorException extends Exception{ //1.Make our own Exception class 2. inherit EXception class
    // then make its Obj and throw to catch
    public InvalidNumeratorException(String msg){//make parametrised Constructor
        super(msg); //pass it to super class
    }
}
class CustomException{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Two Digits: ");
        try {
            int a = kb.nextInt();
            int b = kb.nextInt();
            if (a<=0) {
                InvalidNumeratorException obj = new InvalidNumeratorException("Numerator Should Not be Negative");
                throw obj;
            }
            int c = a/b;
            System.out.println("Division: "+c);
        }catch (InputMismatchException | ArithmeticException | InvalidNumeratorException ex){//multicatch
            System.out.println(ex.getMessage());
        }
    }
}

