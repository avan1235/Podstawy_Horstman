package klasy.ArrayList;

/**
 * Created by Maciej Procyk on 23.04.2018.
 */
import java.time.*;

/**
 * Created by Maciej Procyk on 13.04.2018.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextIdNumber = 0;    // wartość niezależna od tego, który obiekt utworzymy
    private int idNumber;

    {
        idNumber = nextIdNumber; // jedynie inkrementujemy wartosc nextIdNumber przy każdym utworzeniu obiektu
        nextIdNumber++;
    }

    public Employee(String name, double salary, int year, int month, int day) {
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public final String getName() { // you can NOT overridden this method
        return this.name;
    }

    public double getSalary() {
        return this.salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    /*
    * @param byPercent wartość określająca, o ile procent podwyższamy pracownikowi pensję
    * @return void
     */
    public void raiseSalary(double byPercent) {
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public int getId() {
        return this.idNumber;
    }

    /*
     *@preturn obiekt String opisujący danego pracownika
     */
    public String toString() {
        return this.getClass().getName() +
                "[name=" + this.name +
                ", salary=" + this.salary +
                ", hireDay=" + this.hireDay +
                ", idNumber=" + this.idNumber + "]";
    }

}
