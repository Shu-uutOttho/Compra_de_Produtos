package entities;

public class Produto {
	private String nome;
	private Double preco;

	public Produto() {

	}

	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

}
