import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class isr {
    public static void main(String[] args) throws IOException { //it's  Efficient than Scanner Class
        System.out.println("plz enter value: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a =  Integer.parseInt(br.readLine());
        System.out.println(a);
    }
}
