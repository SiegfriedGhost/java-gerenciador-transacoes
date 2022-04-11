package br.com.bb8leko.gerenciador.usuario;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import br.com.bb8leko.gerenciador.negociacao.Negociacao;

public class Usuario {

	private String nome;
	private int idade;
	private List<Negociacao> negociacoes = new LinkedList<Negociacao>();
	private Set<Negociacao> negociacoesEmConjunto = new HashSet<Negociacao>(negociacoes);

	public Usuario(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public List<Negociacao> getNegociacoes() {
		// return negociacoes
		return Collections.unmodifiableList(negociacoes);
	}

	public Set<Negociacao> getNegociacoesEmConjunto() {
		return Collections.unmodifiableSet(negociacoesEmConjunto);
	}

	public void addNegociacao(Negociacao negociacao) {
		this.negociacoes.add(negociacao);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Nome: " + getNome() + " Idade: " + getIdade() + " Negociações: " + getNegociacoes() + "]";
	}
}
