package br.com.stefanini.maratonadev.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="endereco")
public class Endereco extends PanacheEntityBase {	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	@Override
	public String toString() {
		return "Endereco [id=" + id + ", cep=" + cep + ", cidade=" + cidade + ", bairro=" + bairro + ", uf=" + uf
				+ ", logradouro=" + logradouro + ", complemento=" + complemento + "]";
	}
	
	

}
