package Main;
import java.util.Scanner;
import DesafioRoupas.Roupas;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			Roupas Roupa=new Roupas();
			System.out.println("Informe os Dados da Roupa\n :");
			System.out.println("Qual a Marca:");
			Roupa.Marca= sc.nextLine ();
			System.out.println("Tipo:");
			Roupa.Tipo=sc.nextLine();
			System.out.println("Tamanho:");
			Roupa.Tamanho= sc.nextLine();
			System.out.println("Quantidade em Estoque:");
			Roupa.Quantidade=sc.nextInt();
			System.out.println("Valor Unitário:");
			Roupa.Valor=sc.nextDouble();
			
			
		}
	}

}
