package EstruturasDeDecisão;

import java.util.Scanner;

public class A03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = sc.nextInt();
		
		
		
		if (n % 2 == 0) {
			
			System.out.printf("O número %d é PAR", n);
			
		} else {
			System.out.printf(" O número %d e ÍMPAR", n);
			
		}
		
		if (n >= 0) {
			
			System.out.printf(" e POSITIVO", n);
			
		}else {
			System.out.printf(" e NEGATIVO", n);
		}

	}

}
