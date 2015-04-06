package br.com.betha.controleacademico.modelo;

public class Aluno {
	
	private int codigo;
	private String nome;
	private String cpf;
	private int matricula;
	private String telefone;
	private String email;
	private String endereco;
	
	

	public int getCodigo() {
		return codigo;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getMatricula() {
		return matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public String getEmail() {
		return email;
	}

	public String getEndereco() {
		return endereco;
	}
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

}
