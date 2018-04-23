package klasy.porownywanie;

import java.util.ArrayList;
import java.util.Vector;

/**
 * Created by Maciej Procyk on 23.04.2018.
 */
public class EqualsTest {
    public static void main(String[] args){
        Employee alice1 = new Employee("Alicja Adamczuk", 7500, 1987,12,15);
        Employee alice2 = alice1;
        Employee alice3 = new Employee("Alicja Adamczuk", 7500, 1987, 12,15);
        Employee bob = new Employee("Bartosz Borkowski", 5000, 1989, 10,1);

        System.out.println("a1==a2 " + (alice1==alice2));
        System.out.println("a1==a3 " + (alice1==alice3));
        System.out.println("a1.equals(a3) " + (alice1.equals(alice3)));
        System.out.println("a1.equals(bob) " + (alice1.equals(bob)));

        System.out.println("bob toString " + bob.toString());

        ArrayList<Employee> myStaff = new ArrayList<>();
        Vector<Employee> vectorStaff = new Vector<>(); // Vector is too old and slow

        int predictedSize = 10;
        System.out.println(myStaff.size());
        myStaff.ensureCapacity(predictedSize);
        System.out.println(myStaff.size());

        myStaff.add(new Employee("Maciejka Procka",10000, 2000,12,12));
        myStaff.add(new Employee("Henio Zbaszyn", 4000, 1990, 12,13));

        System.out.println(myStaff.size());
        myStaff.trimToSize(); // cutting unused space




    }
}
