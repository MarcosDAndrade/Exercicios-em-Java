package ExercicioMedia;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student t = new Student();
		
		System.out.println("Type first trimester note: ");
		double first = sc.nextDouble();
		t.setFirsttime(first);
		
		System.out.println("Type first trimester note: ");
		double second = sc.nextDouble();
		t.setSecondtime(second);
		
		System.out.println("Type first trimester note: ");
		double third = sc.nextDouble();
		t.setThirdtime(third);
		
		
		t.showResults();
		
		sc.close();
	}

}
