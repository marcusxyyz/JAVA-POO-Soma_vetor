package application;

import java.util.Locale;
import java.util.Scanner;

import entities.SumVect;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you type? ");
		int n = sc.nextInt();
		
		SumVect[] vect = new SumVect[n];
		
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			double number = sc.nextDouble();
			vect[i] = new SumVect(number);
		}
		
		System.out.println();
		
		double sum = 0;
		System.out.print("VALUES = ");
		for (int i=0; i<vect.length; i++) {
			System.out.print(vect[i].getNumber() + "  ");
			sum += vect[i].getNumber();
		}
		
		System.out.println();
		System.out.printf("SUM = %.2f%n", sum);
		
		double avg = sum / vect.length;
		System.out.printf("AVERAGE = %.2f%n", avg);
		
		sc.close();
	}

}
