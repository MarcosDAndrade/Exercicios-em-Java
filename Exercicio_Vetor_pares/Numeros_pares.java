package Exercicio_Vetor_pares;

import java.util.Scanner;

public class Numeros_pares {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, totalpares = 0;
		
		System.out.print("Quantos números irá digitar? ");
		n =sc.nextInt();
		int[] num = new int[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextInt();	
			if (num[i]%2 == 0) {		
			totalpares += 1;
			}
		}
		
		
		System.out.println("Números Pares:");
		for(int i=0;i<n;i++) {
			if (num[i]%2 == 0) {
			System.out.println(num[i]);}
		}
		System.out.println("QUANTIDADE DE PARES: " + totalpares);
	
		sc.close();
	}
	}

