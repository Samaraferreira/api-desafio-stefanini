package br.com.stefanini.maratonadev.model;

import java.math.BigInteger;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="user")
@NamedNativeQueries({
	@NamedNativeQuery(name="LISTAR_USUARIOS", query = ""
			+ "SELECT nome, cpf, email, contato, endereco_id FROM user", resultClass = User.class),
})
public class User extends PanacheEntityBase {
	
	@Id
	@Column(name="cpf", nullable = false, unique = true)
	private BigInteger cpf;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="email", unique = true)
	private String email;
	
	@Column(name="contato")
	private int contato;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
	
	public User() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigInteger getCpf() {
		return cpf;
	}

	public void setCpf(BigInteger cpf) {
		this.cpf = cpf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

}
