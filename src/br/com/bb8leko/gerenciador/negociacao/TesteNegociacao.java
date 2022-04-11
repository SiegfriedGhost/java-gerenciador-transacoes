package br.com.bb8leko.gerenciador.negociacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TesteNegociacao {

	public static void main(String[] args) {

		Negociacao neg = new Negociacao("PETR4", 100, 95.5);
		Negociacao neg2 = new Negociacao("BBAS3", 100, 100.5);

		ArrayList<Negociacao> negociacao = new ArrayList<Negociacao>();

		// Exemplo 1
		negociacao.add(neg);
		negociacao.add(neg2);
		System.out.println("Teste 1:");
		System.out.println(negociacao.toString());
		System.out.println(negociacao.get(0));

		// Exemplo 2 - Foreach
		System.out.println("Teste 2:");
		for (Negociacao transacao : negociacao) {
			System.out.println(transacao.toString());
		}
		// Exemplo 3 - Foreach (Consumer)
		System.out.println("Teste 3:");
		negociacao.forEach(trans -> {
			System.out.println(trans.toString());
		});

		System.out.println("Ordenando");
		Collections.sort(negociacao);
		System.out.println(negociacao.toString());
		Collections.sort(negociacao, Comparator.comparing(Negociacao::getPapel));
		System.out.println(negociacao.toString());
		negociacao.sort(Comparator.comparing(Negociacao::getPapel));

	}

}
