package Exercicio_Vetor_mediapares;

import java.util.Scanner;
/*Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR" */
public class Media_pares {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		int n, cont=0,soma = 0;
		double media;
		
		System.out.println("Quantos elementos vai ter o vetor?");
		n = sc.nextInt();
		int [] num = new int[n];
		
		for (int i=0;i<n;i++) {
			System.out.println("Digite um número: ");
			num[i] = sc.nextInt();
			
			if(num[i]%2 == 0) {
				soma = soma+=num[i];
				cont ++;
			}
		}
			
		media = soma/cont;		
		if(media>0) {
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}else {
			System.out.println("NENHUM NÚMERO PAR!");
		}	
		
		sc.close();
	}

}
