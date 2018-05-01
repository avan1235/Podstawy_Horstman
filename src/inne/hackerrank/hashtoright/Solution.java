package inne.hackerrank.hashtoright;

/**
 * Created by Maciej Procyk on 01.05.2018.
 */

import java.util.*;

public class Solution {

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
        for(int i = 0; i < n; i++){
            int j = 0;
            while ( j < n-i-1){
                System.out.print(" ");
                j++;
            }
            while(j < n){
                System.out.print("#");
                j++;
            }
            System.out.println();
        }

    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine().trim());

        staircase(n);
    }
}

