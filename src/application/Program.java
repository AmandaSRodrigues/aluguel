package application;

import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Aluguel[] vect = new Aluguel[10]; 
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		System.out.println();
		
		for (int i=1; i <=n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.print("Name: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			vect[room] = new Aluguel(nome, email);
			System.out.println();
		}
		
		System.out.println("Busy rooms:");
		for (int i = 0; i < 10; i++) {
			if (vect[i] != null) {
				System.out.println(i + "; " + vect[i]);
			}
		}
		
		
		sc.close();

	}

}





             