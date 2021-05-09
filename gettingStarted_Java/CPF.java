/**Elabore um programa que possuas as características abaixo:

    Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
    Imprima os quatro grupos numéricos, sendo um valor por linha.
 */

import java.io.IOException;
import java.util.Scanner;
 
public class CPF {
    public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		String STR = leitor.next();
		String A = STR.substring(0, 3);
		String B = STR.substring(4, 7);
		String C = STR.substring(8, 11);
		String D = STR.substring(12, 14);
		System.out.println(A);
		System.out.println(B);
		System.out.println(C);
		System.out.println(D);
	}
	
}
    

