package klasy.porownywanie;

/**
 * Created by Maciej Procyk on 23.04.2018.
 */
public class Manager extends Employee {
    private double bonus;
    public Manager(String name, double salary, int year, int month, int day, double bonus){
        super(name, salary, year, month, day);
        this.bonus = bonus;
    }

    public double getSalary(){
        return super.getSalary() + this.bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public boolean equals(Object otherObject){
        if(!super.equals(otherObject))
            return false;
        Manager other = (Manager) otherObject;
        return this.bonus == other.bonus;
    }

    public int hashCode(){
        return super.hashCode() + 17 + Double.hashCode(this.bonus);
    }

    public String toString(){
        return super.toString() + "[bonus=" + this.bonus + "]";
    }
}
