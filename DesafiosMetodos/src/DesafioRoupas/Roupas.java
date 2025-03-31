package DesafioRoupas;

public class Roupas {
	
public String Marca;
public String Tipo;
public String Tamanho;
public int Quantidade;
public double Valor;

public double RoupaValor() {
	double ValorTotal=Quantidade*Valor;
	return ValorTotal;
}
public void Devolve (int Quantidade) {
	this.Quantidade+= Quantidade;

}


}
