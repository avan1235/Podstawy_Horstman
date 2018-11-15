package klasy.dziedziczenie;

/**
 * Created by Maciej Procyk on 13.04.2018.
 */
public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double salary, int year, int month, int day){
        super(name, salary, year, month, day);
        bonus = 0;
    }

    @Override
    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    /*
    Method toString will be called when
    Manager m = new Manager();
    *@return String about Manager
     */

    public String toString(){
        return super.toString() +
                "[bonus=" + this.bonus + "]";
    }
}
