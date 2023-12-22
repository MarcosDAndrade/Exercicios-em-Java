package Exercicio_Banco;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account Holder: ");
		String name = sc.nextLine();
		System.out.println("Enter account Number: ");
		int number = sc.nextInt(); 
		
		Costumer cm = new Costumer(name, number);
		
		cm.initial();
		cm.deposit();
		cm.withdraw();
		
		sc.close();
		}
	}
	
