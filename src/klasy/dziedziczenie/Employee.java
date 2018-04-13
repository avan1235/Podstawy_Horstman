package klasy.dziedziczenie;
import java.time.*;

/**
 * Created by Maciej Procyk on 13.04.2018.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;
    private static int nextIdNumber = 0;
    private int idNumber;

    {
        idNumber = nextIdNumber;
        nextIdNumber++;
    }

    public Employee(String name, double salary, int year, int month, int day){
        this.name = name;
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getName(){
        return this.name;
    }

    public double getSalary(){
        return this.salary;
    }

    public LocalDate getHireDay(){
        return hireDay;
    }

    public void raiseSalary(double byPercent){
        double raise = this.salary * byPercent / 100;
        this.salary += raise;
    }

    public int getId(){
        return this.idNumber;
    }

}
