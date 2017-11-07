package br.com.javaweb.agenda.to;

public class EmailContatoTO {
	
	private String nome;
	private String email;
	
	public EmailContatoTO() {}
	
	public EmailContatoTO(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
