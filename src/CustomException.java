import java.util.InputMismatchException;
import java.util.Scanner;

class Dividensum{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter Two Digits: ");
        try {
            int a = kb.nextInt();
            int b = kb.nextInt();
            int c = a/b;
            System.out.println("Division: "+c);
        }catch (InputMismatchException obj){
            System.out.println(obj);
            System.out.println("please Enter Digits only");
        }
        catch (ArithmeticException obj){
            obj.getStackTrace();
        }
    }
}
