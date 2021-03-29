package one.digitalinnovation.class.pessoa;

public class ProgramaPessoaFisica {
	
	public static void main(String[] args) {
		final PessoaFisica pessoaFisica = new PessoaFisica( idade: 33, peso:100.5f);
		
		System.out.println(pessoaFisica.relatorio());
	}
	
}