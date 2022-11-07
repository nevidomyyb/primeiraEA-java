package application;

import java.util.Scanner;

import entities.Entrance;

public class Main {
	
	public static void main(String[] args) {
		
		double total = 0;
		Scanner sc = new Scanner(System.in);
		Entrance[] ingressos = new Entrance[100];
		System.out.println("BEM VINDO A BILHETERIA");
		System.out.println("QUAL FILME DESEJA ASSISTIR?");
		System.out.println("1: Adão Negro");
		System.out.println("2: A Órfã 2");
		System.out.println("3: Sorria");
		System.out.println("4: O Telefone Preto");
		System.out.println("---------------------------");
		int op = sc.nextInt();
		sc.nextLine();
		if (op == 1) {
			ing("Adão Negro", sc, ingressos);
		}
		if (op == 2) {
			ing("A Órfã 2", sc, ingressos);
		}
		if (op == 3) {
			ing("Sorria", sc, ingressos);
		}
		if (op == 4) {
			ing("O Telefone Preto", sc, ingressos);
		}
		for (int i = 0 ; i<ingressos.length; i++) {
			if (ingressos[i] == null) break;
			total += ingressos[i].getPrice();
		}
		System.out.printf("Valor total: R$ %.2f", total );
	}
	private static void ing (String name, Scanner sc, Entrance[] ingressos) {
		System.out.println("Quantos ingressos serão comprados?");
		int qntd = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i<qntd; i++) {
			System.out.println("[0] inteira [1] meia");
			int tipo = sc.nextInt();
			sc.nextLine();
			System.out.println("[1]14:00");
			System.out.println("[2]16:00");
			System.out.println("[3]18:00");
			int hora = sc.nextInt();
			sc.nextLine();
			if (hora == 1) ingressos[i] = new Entrance(name, tipo, "14:00");
			else if (hora == 2) ingressos[i] = new Entrance(name, tipo, "16:00");
			else if (hora == 3) ingressos[i] = new Entrance(name, tipo, "18:00");
		}
	}

}
