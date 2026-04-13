package ExercicioSalario;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Employee e = new Employee();
		
		// Informando os dados a serem lidos
		System.out.println("Name: ");
		String name = sc.nextLine();
		e.setName(name);
		System.out.println("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		e.setGrossSalary(grossSalary);
		System.out.println("Taxs: ");
		double tax = sc.nextDouble();
		e.setTax(tax);
		
		System.out.println("Employee: " + name + " $ " + e.Netsalary() );

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();

		e.increaseSalary(percentage);
		
		
		sc.close();
	}
	}
