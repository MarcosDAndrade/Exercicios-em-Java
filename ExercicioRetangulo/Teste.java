package ExercicioRetangulo;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		Rectangule r = new Rectangule();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Enter rectangule width and height: ");
		r.width = leia.nextDouble();
		r.height = leia.nextDouble();
		
		System.out.println("Area: " + r.area()); 
		System.out.println("Perimeter: " + r.perimeter()); 
		System.out.println("Diagonal: " + r.diagonal()); 
		
		leia.close();
	}

}
