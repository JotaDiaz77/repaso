package ejerciciosArrays;

import java.util.Scanner;

public class Ejericio3 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < num.length; i++){
            System.out.print("Introduce el número "+(i+1)+": ");
            num[i] = sc.nextInt();
        }

        for (int j = num.length-1; j >= 0; j--){
            if (j == 0){
                System.out.print(num[j]);
            }else if(j == 1){
                System.out.print(num[j]+" y ");
            }else{
                System.out.print(num[j]+", ");
            }
        }


    }

}
