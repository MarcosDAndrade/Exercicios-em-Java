package Exercicio_Listas_Salario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List_Salário {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		
		for (int i =0;i<n;i++) {
			System.out.println("Employee #" + (i+1)+":");
			System.out.print("ID: ");
			Integer id = sc.nextInt();
			while(hasId(list, id)) {
				System.out.println("Already taken! Try Again: ");
				id = sc.nextInt();
			}
			
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			
			list.add(emp);
		}
		System.out.print("Enter the employee id that will have salary increase: ");
		int idsalary = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);
		
		//Integer pos = position(list, idsalary);
		
		if (emp == null) {
			System.out.print("This id doesn't exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee e : list) {
			System.out.println(e);
		}		
		
		
		sc.close();
	}
	
/*	// Função auxiliar que procura o ID da lista
	
	public static Integer position(List<Employee> list, int id){
		for (int i = 0; i<list.size();i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
		}*/
	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
