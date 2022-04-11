package br.com.bb8leko.gerenciador.negociacao;
import java.io.PrintStream;

public class Negociacao implements Comparable<Negociacao> {

	private String papel;
	// private String data;
	private int quantidade;
	private double valor;

	public Negociacao(String papel, int quantidade, double valor) {
		this.papel = papel;
		this.quantidade = quantidade;
		this.valor = valor;
	}

	public String getPapel() {
		return papel;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getValor() {
		return valor;
	}

	@Override
	public String toString() {
		return "[Papel: " + this.papel + " Quantidade: " + this.quantidade + " Valor: " + this.valor + "]";
	}

	@Override
	public int compareTo(Negociacao outraNegociacao) {
		return this.papel.compareTo(outraNegociacao.papel);
	}

}
