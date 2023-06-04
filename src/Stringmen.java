import java.util.Locale;
import java.util.Scanner;

public class Stringmen {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        //String name = new String();

        /*name=kb.nextLine();
        System.out.println(name.toUpperCase());
        System.out.println(name.charAt(4));
        System.out.println();
        */

        StringBuilder name2 = new StringBuilder();
        System.out.println("enter name: ");
        name2.append(kb.nextLine());
        System.out.println(name2.deleteCharAt(3));
        System.out.println(name2.reverse());
    }
}
