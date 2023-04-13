package EstruturasDeDecisão;

import java.util.Scanner;

public class A04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		//Entrada de Dados e informações
		System.out.print("Digite seu nome: ");
		String nome = sc.next();
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = sc.next();
		System.out.print("Digite sua idade: ");
		int idade = sc.nextInt();
		System.out.print("Digite sua naturalidade: ");
		String naturalidade = sc.next();
		
		System.out.print("Deseja vizualizar dados completos? " );
		String resposta = sc.next();
		
		
		// Saída de Dados utilizando a estrutura de decisão
		if(resposta.equals("S") || resposta.equals("SIM") || resposta.equals("Sim") || resposta.equals("sim")) {
			System.out.printf("Seu nome é %s %s, você tem %d anos e mora no/em %s", nome, sobrenome, idade, naturalidade);
			
		}else if(resposta.equals("N") || resposta.equals("NÃO") || resposta.equals("Não") || resposta.equals("não") || resposta.equals("nao") || resposta.equals("NAO") || resposta.equals("Nao")) {
			System.out.printf("Seu nome é %s e sua idade é %d ", nome, idade);
			
		}else {
			System.out.println("Digitação errada!");
		}

	} 

}
