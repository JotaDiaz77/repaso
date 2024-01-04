package ejerciciosArrays;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        int num, position=0;
        int[] nums = new int[10];

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce 5 números en orden creciente");
        System.out.print("Número 1: ");
        nums[0] = sc.nextInt();
        for (int i = 1; i <= 4; i++){
            do{
                System.out.print("Número "+(i+1)+": ");
                nums[i] = sc.nextInt();
            }while (nums[i] < nums[i-1]);
        }

        System.out.println("<----------------------->");
        for (int gap:nums){
            System.out.print(gap+" ");
        }
        System.out.println();
        System.out.println("<----------------------->");

        System.out.print("Introduzca otro número: ");
        num = sc.nextInt();

        for( int x = 0; x < 4; x++){
            if(nums[x] < num){
                position++;
            }
        }

        for(int j = 4; j >=position; j--){
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
