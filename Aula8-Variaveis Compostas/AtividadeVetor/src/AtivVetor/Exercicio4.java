package AtivVetor;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        List<String> palavras = new ArrayList<>();
        palavras.add("Gato");
        palavras.add("Papagaio");
        palavras.add("Cachorro");
        palavras.add("Leão");
        palavras.add("Pato");
        

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite a letra para remover as palavras que a contêm: ");
        char letra = sc.next().charAt(0);
        

        List<String> palavrasFiltradas = new ArrayList<>();
        
        for (String palavra : palavras) {
            if (palavra.indexOf(letra) == -1) {
                palavrasFiltradas.add(palavra);
            }
        }
        
        
        System.out.println("Lista de palavras após remoção:");
        for (String palavra : palavrasFiltradas) {
            System.out.println(palavra);
        }
        
        sc.close();
    }
}