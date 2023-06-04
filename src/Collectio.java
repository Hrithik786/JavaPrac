import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
class Emp implements Comparable{
    int age;
    String name;
    double sal;
    public Emp(int age, String name, double sal) {
        this.age = age;
        this.name = name;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Emp{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
    @Override
    public int compareTo(Object OBJ) {
        Emp temp = (Emp) OBJ;
        if (this.age > temp.age)
            return 1;
        else if (temp.age > this.age)
            return -1;
        else {
            if (this.sal > temp.sal)
                return 1;
            else if (temp.sal > this.sal)
                return -1;
            else
                return 0;
        }
    }
}
public class Collectio {
    public static void main(String[] args) {

        ArrayList <Emp> emplist = new ArrayList<>();

        Emp e1 =new Emp(25,"Hrithik",45000);
        emplist.add(e1);

        Emp e2 =new Emp(20,"Nikhil",50000);
        emplist.add(e2);

        Emp e3 =new Emp(18,"Sonu",95000);
        emplist.add(e3);

        Emp e4 =new Emp(18,"Jcki",75000);
        emplist.add(e4);

        for (Emp employee : emplist) {
            System.out.println(employee);
        }

        Collections.sort(emplist);

        for (Emp employee:emplist) {
            System.out.println(employee);
        }

    }
}
