package klasy.abstrakcyjne;
import java.time.*;

/**
 * Created by Maciej Procyk on 13.04.2018.
 */

public class Employee extends Person {
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
        super(name);
        this.salary = salary;
        this.hireDay = LocalDate.of(year, month, day);
    }

    public String getDescription(){
        return String.format("pracownik zarabiający %.2f zł", this.salary);
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

    public String toString (){  // Method which will works in inheritance classes
        return this.getClass().getName() +
                "[name=" + this.name +
                ", salary=" + this.salary +
                ", hireDay=" + this.hireDay +
                ", idNumber=" + this.idNumber + "]";
    }

}
