package EstruturasDeDecisão;

import java.util.Scanner;

public class A02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite 3 números e os colocarei em ordem crescente");
		System.out.print("Número 1: ");
		int n1 = sc.nextInt();
		System.out.print("Número 2: ");
		int n2 = sc.nextInt();
		System.out.print("Número 3: ");
		int n3 = sc.nextInt();
		
		// Ordena os números em ordem crescente
		if (n1 > n2) {
			int temp = n1;
			n1 = n2;
			n2 = temp;
			
		} else if (n1 > n3){
			int temp = n1;
			n1 = n3;
			n3 = temp;
		
			
		} else if (n2 > n3) {
			int temp = n2;
			n2 = n3;
			n3 = temp;
			
		}
		
		System.out.printf("Levando em consideração os números digitados, em ordem crescente ficaria %d, %d, %d", n1, n2, n3);
			
	}

}
