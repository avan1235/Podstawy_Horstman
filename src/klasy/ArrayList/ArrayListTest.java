package klasy.ArrayList;

import java.util.ArrayList;

/**
 * Created by Maciej Procyk on 23.04.2018.
 */
public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<Employee> myStaff = new ArrayList<>();
        myStaff.ensureCapacity(3);

        myStaff.add(new Employee("Janek Janulski", 3000,1298,12,14));
        myStaff.add(new Employee("Janusz Kowlaski", 3400, 1990, 3,1));
        myStaff.add(new Employee("Julian Biały", 20000, 1998, 3,12));

        for (Employee actEmployee : myStaff){
            actEmployee.raiseSalary(7);
        }

        myStaff.add(myStaff.size()/2, new Employee("Henio Bezgłowy", 5000,1998,4,21));

        for (Employee actEmployee : myStaff){
            System.out.println(actEmployee.toString());
        }

        int var = Integer.parseInt("123");

        System.out.printf("Nasza liczba to %d", var);

    }
}
