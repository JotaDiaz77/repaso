package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        final int NUM = 5;
        int neg=0, pos=0, suma_neg=0, suma_pos=0;
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[NUM];

        for (int i = 0; i < NUM; i++){
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextInt();
        }

        for (int numero:numeros){
            if(numero < 0){
                neg += 1;
                suma_neg += numero;
            }else{
                pos+=1;
                suma_pos += numero;
            }
        }

        System.out.println("Hay "+neg+" números negativos");
        System.out.println("Y su media es de "+(suma_neg/neg));
        System.out.println("Hay "+pos+" números positivos");
        System.out.println("Y su media es de "+(suma_pos/pos));


    }
}
