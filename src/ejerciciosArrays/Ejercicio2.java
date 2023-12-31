package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final int NUM_ALUMN;
        double media_notas=0;
        double[] notas;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de alumnos: ");
        NUM_ALUMN = sc.nextInt();

        notas = new double[NUM_ALUMN];

        for (int i = 0; i < notas.length; i++){
            System.out.print("Introduzca la nota del alumno "+(i+1)+": ");
            notas[i] = sc.nextDouble();
            media_notas += notas[i];
        }

        media_notas = media_notas / NUM_ALUMN;

        System.out.println("La nota media de la clase es de: "+media_notas);

        for (int j = 0; j < notas.length; j++){
            if (notas[j] > media_notas){

            }
        }
    }
}
