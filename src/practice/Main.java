package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        Employee emp2 = new Employee(2, "Bob");
        System.out.println(emp1);
        System.out.println(emp2);

        emp1 = emp2=null;
        System.gc(); // Suggests JVM to run Garbage Collector
        System.runFinalization(); // Suggests JVM to run Finalization

        // List<Integer> list1 = Arrays.asList(1,2,3,null);

        // List<Integer> list = List.of(2,3);

        // System.out.println(list1);
        // System.out.println(list);

        List<Employee> employees = Arrays.asList(new Employee(13,"surya"), new Employee(42, "Alice"), new Employee(434, "Bob"), new Employee(56, "Charlie"));
        Collections.sort(employees, (Employee emp3, Employee emp4) -> (emp4.getId() - emp3.getId() ));
        System.out.println("Employees sorted in descending order of IDs:");
        employees.forEach(emp -> System.out.println(emp));
    }
}   