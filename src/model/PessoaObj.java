/**
 * 
 */
package model;

import java.time.LocalDate;

/**
 * @author Lucas Batista 23 de mar. de 2024
 */
public class PessoaObj {
	private String nome;
	private LocalDate dataNascimento;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int ano, int mes, int dia) {
		LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
		LocalDate agora = LocalDate.now();
		int idade = agora.getYear() - dataNascimento.getYear();

//		 
		if (idade < 0 && idade > 150) {
			System.out.println("Idade inválida");
		} else {
			this.dataNascimento = dataNascimento;
		}

	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		LocalDate nascimento = getDataNascimento();
		LocalDate agora = LocalDate.now();
		int idade = agora.getYear() - nascimento.getYear();

        if (dataNascimento.getMonthValue() > agora.getMonthValue() ||
            (dataNascimento.getMonthValue() == agora.getMonthValue() &&
            dataNascimento.getDayOfMonth() > agora.getDayOfMonth())) {
            idade--;
        }
		return idade;
	}

}
