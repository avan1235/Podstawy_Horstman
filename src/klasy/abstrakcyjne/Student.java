package klasy.abstrakcyjne;

/**
 * Created by Maciej Procyk on 14.04.2018.
 */
public class Student extends Person {
    private String whatStudy;

    public Student(String name, String whatStudy){
        super(name);
        this.whatStudy = whatStudy;
    }

    public String getDescription(){
        return "student specjalizacji " + this.whatStudy;
    }
}
