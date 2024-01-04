package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        int[] first = new int[5];
        int[] second = new int[5];
        int[] third = new int[10];
        int f, s, t;

        f = s = t = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("<--------PRIMER ARRAY--------->");
        System.out.print("Número 1: ");
        first[0] = sc.nextInt();
        for (int i = 1; i <= 4; i++){
            do{
                System.out.print("Número "+(i+1)+": ");
                first[i] = sc.nextInt();
            }while (first[i] < first[i-1]);
        }

        System.out.println("<--------SEGUNDO ARRAY--------->");
        System.out.print("Número 1: ");
        second[0] = sc.nextInt();
        for (int j = 1; j <= 4; j++){
            do{
                System.out.print("Número "+(j+1)+": ");
                second[j] = sc.nextInt();
            }while (second[j] < second[j-1]);
        }

        while (f < 5 && s < 5){
            if(first[f] < second[s]){
                third[t] = first[f];
                f++;
            }else{
                third[t] = second[s];
                s++;
            }
            t++;
        }

        if(f == 5){
            while (s < 5){
                third[t] = second[s];
                s++;
                t++;
            }
        }else{
            while (f < 5){
                third[t] = first[f];
                f++;
                t++;
            }
        }

        for(int num:third){
            System.out.print(num+" ");
        }
    }
}
