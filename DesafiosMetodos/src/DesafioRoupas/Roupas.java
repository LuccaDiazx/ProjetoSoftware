package DesafioRoupas;

public class Roupas {
	
public String Marca;
public String Tipo;
public String Tamanho;
public int Quantidade;
public double Valor;

public void Decrementa(int Quantidade) {
	
	if(Quantidade>this.Quantidade) {
		System.out.println("Não é possível remover mais do que o disponível no Estoque!!");
		
	}else {
		this.Quantidade-=Quantidade;
	}
}
	public void Incrementa (int Quantidade) {
		this.Quantidade+=Quantidade;
	}
	public double ValorTotal() {

		double TotalEstoque = Quantidade * Valor;
		return TotalEstoque;
		
	}

	public String toString() {
		return "Roupa Marca=" + Marca +
				"\n, Tipo=" + Tipo +
				"\n, Tamanho=" + Tamanho +
				"\n, Quantidade=" + Quantidade + 
				"\n, Valor=" + Valor +
				"\n, Valor Total: R$" + ValorTotal();
	}
		
}
