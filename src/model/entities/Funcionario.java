package model.entities;

public class Funcionario implements Comparable<Funcionario> {
	private String nome;
	private Double salario;

	public Funcionario() {
		super();
	}

	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public int compareTo(Funcionario other) {
		// ordem alfabetica por nome
		return nome.compareTo(other.getNome());
		// ordem do menor salário para o maior salário
		// return salario.compareTo(other.getSalario());
		// ordem do maior para o menor salário
		// return -salario.compareTo(other.getSalario());
	}

}
