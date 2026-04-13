package Exercicio_Banco;

import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double value = 0;
        Costumer cm = new Costumer();
		System.out.println("Enter account Holder: ");
		String name = sc.nextLine();
		System.out.println("Enter account Number: ");
		int number = sc.nextInt();



        System.out.println("Is there na initial deposit (y/n)?");
        char opc = sc.next().charAt(0);
        if (opc == 'y'){
            System.out.println("Enter Initial Value: ");
            value = sc.nextDouble();

            cm = new Costumer(name, number, value);
            cm.initial(value);

        } else {
            cm = new Costumer(name, number);
            cm.Status();
        }

        System.out.println("Enter deposit value data: ");
        value = sc.nextDouble();
		cm.deposit(value);

        System.out.println("Enter withdraw value data: ");
        value = sc.nextDouble();
		cm.withdraw(value);
		
		sc.close();
		}
	}
	
