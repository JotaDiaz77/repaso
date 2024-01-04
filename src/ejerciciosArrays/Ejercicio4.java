package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num, position;
        int[] nums = new int[10];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 9; i++){
            System.out.print("Introduce número "+(i+1)+": ");
            nums[i] = sc.nextInt();
        }
        System.out.println("<----------------------->");
        for (int gap:nums){
            System.out.print(gap+" ");
        }
        System.out.println();
        System.out.println("<----------------------->");

        System.out.print("Introduzca otro número: ");
        num = sc.nextInt();
        System.out.print("Introduzca su posición: ");
        position = sc.nextInt();

        for(int j = 8; j >= position; j--){
            nums[j+1] = nums[j];
        }

        nums[position] = num;

        System.out.println("<----------------------->");
        for (int gap:nums){
            System.out.print(gap+" ");
        }
        System.out.println();
        System.out.println("<----------------------->");
    }
}
