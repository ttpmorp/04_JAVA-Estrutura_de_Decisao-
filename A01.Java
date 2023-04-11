package EstruturasDeDecisão;

import java.util.Scanner;

public class A01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Entrada de dados
		System.out.print("Digite um número: ");
		int n1 = sc.nextInt();
		System.out.print("Digite outro número: ");
		int n2 = sc.nextInt();
		
		if (n1 > n2) {
			System.out.printf("O número %d é mais que o número %d", n1, n2);
		} else {
			System.out.printf("O número %d é maior que o número %d", n2, n1);
		}
		
	}

}
