package org.example;
import java.util.Scanner;
public class forExeI {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cont = 0;


        for (int x = sc.nextInt(); cont <= x; cont++){

            if (cont % 2 != 0){
                System.out.println(cont);
            }


        }

    }

}
