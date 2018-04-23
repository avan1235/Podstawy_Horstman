package klasy.porownywanie;

import java.time.LocalDate;
import java.util.Objects;

/**
 * Created by Maciej Procyk on 23.04.2018.
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

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
        return this.hireDay;
    }

    public void raiseSalay(double byPercent){
        double increase = this.salary * byPercent / 100;
        this.salary += increase;
    }

    public boolean equals(Object otherObject){
        if (otherObject == this)
            return true;

        if (otherObject == null)
            return false;

        if (this.getClass() != otherObject.getClass())
            return false;

        Employee other = (Employee) otherObject;

        return Objects.equals(this.name, other.name) && this.salary == other.salary && Objects.equals(this.hireDay, other.hireDay);
    }

    public int hashCode(){
        return Objects.hash(this.name, this.salary, this.hireDay);
    }

    public String toString(){
        return this.getClass().getName() +
                "[name=" + this.name +
                ", salary=" + this.salary +
                ", hireDay=" + this.hireDay.toString() +
                "]";
    }
}

