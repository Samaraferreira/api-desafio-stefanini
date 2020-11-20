package br.com.stefanini.maratonadev.model;

import javax.persistence.Column;

public class Endereco {	
	@Column(name="cep", nullable = false)
	private String cep;
	
	@Column(name="cidade", nullable = false)
	private String cidade;
	
	@Column(name="bairro", nullable = false)
	private String bairro;
	
	@Column(name="uf", nullable = false)
	private String uf;
	
	@Column(name="logradouro")
	private String logradouro;
	
	@Column(name="complemento", nullable = false)
	private String complemento;

	public Endereco() {
		super();
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	

}
