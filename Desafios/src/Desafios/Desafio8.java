package Desafios;

import java.util.Scanner;

public class Desafio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double soma = 0;
        int cont = 0;
        double numero;
        System.out.println("Digite números para calcular a média (Se quiser cancelar, digite 0)");
        
        do {
            System.out.print("Digite o número: ");
            numero = sc.nextDouble();
            
            if (numero != 0) {
                soma += numero;
                cont++;
            }
        } while (numero != 0);
        
        if (cont > 0) {
            double media = soma / cont;
            System.out.printf("A média dos números digitados é: %.2f\n" + media);
        } else {
            System.out.println("Nenhum número válido foi digitado.");
        }
        
        sc.close();
    }
}
