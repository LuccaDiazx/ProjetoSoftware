package DesafioCalculadoraExcecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calc {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int Numerador = 0;
		int Denominador = 0;
		
		while(true) {
		try {
			System.out.println("Divisão de dois números inteiros!\n");
			System.out.println("Digite o Numerador: ");
			 Numerador = sc.nextInt();
			break;
		} catch (InputMismatchException e) {
			System.out.println("Erro. Digite um número inteiro válido!\n");
			sc.nextLine();
		}

	}
		
		while(true) {
			try {
				System.out.println("Digite o denominador: ");
				Denominador = sc.nextInt();
				
				double div = (Numerador / Denominador);
				System.out.println(div);
				
				break;
			} catch (InputMismatchException e) {
				System.out.println("Erro. Digite um número inteiro válido!\n");
				sc.nextLine();
				
		}  catch (ArithmeticException e) {
			System.out.println("A divisao por 0 é impossivel " + e.getMessage());
		}
		}
		

		sc.close();
		
		
		
	}

}