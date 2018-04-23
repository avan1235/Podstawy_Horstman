package klasy.abstrakcyjne;

/**
 * Created by Maciej Procyk on 14.04.2018.
 */
public class PersonTest {
    public static void main(String[] args){
        Person[] people = new Person[2];
        people[0] = new Employee("Janek Kowalski", 5000, 1999, 12,6);
        people[1] = new Student("Nikodem Antoniak", "informatyka");

        for (Person p : people){
            System.out.println(p.getName() + " -> " + p.getDescription());
        }
    }
}
