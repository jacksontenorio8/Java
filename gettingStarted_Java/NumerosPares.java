/*Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo. */

import java.util.Scanner;

public class NumerosPares{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for(int i = 2; i <= numero; i = i +2){
            System.out.println(i);
        }   
    }
}