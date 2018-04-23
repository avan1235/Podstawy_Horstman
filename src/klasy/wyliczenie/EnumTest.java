package klasy.wyliczenie;

import java.util.Scanner;

/**
 * Created by Maciej Procyk on 23.04.2018.
 */
public class EnumTest {
    enum Size
    {
        SMALL("S"), MEDIUM("M"), LARGE("L"), EXTRA_LARGE("XL");
        private String abbreviation;
        private Size(String abbreviation){
            this.abbreviation = abbreviation;
        }

        public String getAbbreviation(){
            return this.abbreviation;
        }
    }

    public static void main(String... args){
        Scanner input = new Scanner(System.in);
        System.out.print("Podaj rozmiar (SMALL, MEDIUM, LARGE, EXTRA_LARGE): ");
        String inputSize = input.nextLine().toUpperCase();
        Size size = Enum.valueOf(Size.class, inputSize);
        System.out.println("rozmiar=" + size);
        System.out.println("skrót=" + size.getAbbreviation());

        if(size == size.EXTRA_LARGE){
            System.out.println("Dobra robota, nie pominąłeś znaku podkreślenia");
        }
    }
}
