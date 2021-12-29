package org.example;
import java.util.Scanner;

public class forExeII {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int cont = 0;
        int x = 0 ;
        int in = 0;
        int out = 0;

        for(int n = sc.nextInt(); cont < n; cont++){

            x = sc.nextInt();
            if (x >= 10 && x <= 20){
                in++;
            }
            else{
                out++;
            }

        }
        System.out.println(in + " in");
        System.out.println(out + " out");
        

    }

}
