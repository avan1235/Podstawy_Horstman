package klasy.dziedziczenie;

/**
 * Created by Maciej Procyk on 13.04.2018.
 */
public class ManagerTest {
    public static void main(String[] args){
        Manager myBoss = new Manager("Maciej Procyk", 5000, 1999, 2, 7);
        myBoss.setBonus(2000);

        Employee[] stuff = new Employee[3];
        stuff[0] = myBoss;
        stuff[1] = new Employee("Janusz Kowalski", 2500, 1960,5,20);
        stuff[2] = new Employee("Adam Nowak", 3000, 1980,3,14);

        for(Employee employeeToShow : stuff){
            System.out.println("name="+employeeToShow.getName()+", salary="+employeeToShow.getSalary()+", ID="+employeeToShow.getId());
        }
    }
}
