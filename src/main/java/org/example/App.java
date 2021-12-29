package org.example;
import java.util.Scanner;

public class App
{

    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String dia = null;

        switch (num){
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terça";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "valor invalido";

        }

        System.out.println("Dia da semana: " + dia);
        
    }
}
