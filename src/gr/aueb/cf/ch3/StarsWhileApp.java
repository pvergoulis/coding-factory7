package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * Print 10 horizontal stars
 */
public class StarsWhileApp {

    public static void main(String[] args) {
        int i = 1;
        int j = 10;

        while (i <=10){
            System.out.print("*");
            i++;
        }

        while (j >= 1){
            System.out.println("*");
            j--;
        }
    }
}
