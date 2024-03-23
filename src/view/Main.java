/**
 * 
 */
package view;

import model.PessoaObj;

public class Main {
	public static void main(String[] args) {
		PessoaObj Lucas = new PessoaObj();
		
		Lucas.setNome("Lucas");
		Lucas.setDataNascimento(2000, 12, 11);
		Lucas.setProfissao("Programador");
		
		System.out.println("A idade do(a) " + Lucas.getNome() + " é " + Lucas.getIdade() + " anos.");
		
	}
}
