package podstawy.struktury;

import java.util.Scanner;

public class Printf {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        newPart();

        System.out.println(Math.nextDown(1./0.)); // Number a little smaller then Double.POSITIVE_INFINITIVE is Double.MAX_VALUE
        System.out.println(Math.nextUp(0.));

        newPart();

        System.out.print("Podaj liczbę całkowitą: ");

        int number = input.nextInt();
        System.out.printf("Dziesiętnie: %d \n" +
                "Szesnatkowo: %x \n" +
                "Ósemkowo: %o \n" +
                "Binarnie: %s\n",
                number, number, number, decToBinString(number));

        double rev = 1. / ((double) number);
        System.out.printf("Odwrotność zmiennoprzecinkowa szesnastkowa: %a ", rev);

        newPart();

        System.out.printf("Podaj kąt: ");
        int angle = input.nextInt();
        System.out.printf("Znormalizowano: %d", Math.floorMod(angle, 360));

        newPart();

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++){
            System.out.printf("Podaj liczbę: ");

            /*
            int temp = input.nextInt();
            if (temp > max)
                max = temp;
            */
            max = Math.max(max, input.nextInt());

        }
        System.out.printf("Największa z nich to: %d", max);


    }

    static void newPart(){
        System.out.println("\n\n#######################################################\n\n");
    }

    static String decToBinString(int number){
        if (number <= 0){
            return "0";
        }
        else{
            String out = "";
            while(number > 0){
                if (number % 2 == 1){
                    out = "1" + out;
                }
                else{
                    out = "0" + out;
                }
                number /= 2;
            }
            return out;
        }
    }
}
