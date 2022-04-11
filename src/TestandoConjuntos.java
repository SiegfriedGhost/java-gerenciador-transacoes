import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestandoConjuntos {

	public static void main(String[] args) {
		
		Set<String> alunos = new HashSet<>();
		
		alunos.add("Leandro Oliveira");
		alunos.add("Leandro Oliveira");
		alunos.add("Ana Paula");
		alunos.add("Taisa Elisabeth");
		alunos.add("Sergio Torres");
		
		for (String aluno : alunos) {
			System.out.println(aluno);			
		}
		
		alunos.forEach(aluno ->  {
			System.out.println(aluno);
		});
		
		List<String> alunosEmConjunto = new ArrayList<>(alunos);
		alunosEmConjunto.add("Maria Silva");
		System.out.println(alunosEmConjunto.get(0));
		System.out.println(alunosEmConjunto);
		System.out.println(alunos);
	}

}
