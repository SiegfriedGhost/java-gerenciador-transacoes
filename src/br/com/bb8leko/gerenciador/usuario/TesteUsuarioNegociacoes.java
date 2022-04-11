package br.com.bb8leko.gerenciador.usuario;

import java.util.List;

import br.com.bb8leko.gerenciador.negociacao.Negociacao;

public class TesteUsuarioNegociacoes {

	public static void main(String[] args) {

		Usuario usu = new Usuario("Leandro Oliveira", 35);

		List<Negociacao> negociacoes = usu.getNegociacoes();
		System.out.println(negociacoes);

		// Se retiramos o Collections.UnmodifiableCollection, torna a funcionar
		// negociacoes.add(new Negociacao("PETR4", 100 , 95.5));
		// System.out.println(negociacoes);

		// Se retiramos o Collections.UnmodifiableCollection, torna a funcionar
		// usu.getNegociacoes().add(new Negociacao("BBAS3", 100, 80.0));
		// System.out.println(usu.getNegociacoes());

		usu.addNegociacao(new Negociacao("BEEF3", 100, 15.0));
		System.out.println(usu.getNegociacoes());

		System.out.println(usu.toString());

		System.out.println(usu.getNegociacoesEmConjunto());
	}
}
