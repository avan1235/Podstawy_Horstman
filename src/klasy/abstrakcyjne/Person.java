package klasy.abstrakcyjne;

/**
 * Created by Maciej Procyk on 14.04.2018.
 */
public abstract class Person {
    private String name;
    public abstract String getDescription();

    public Person(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
