package br.com.stefanini.maratonadev.model;

import java.math.BigInteger;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="user")
@NamedNativeQueries({
	@NamedNativeQuery(name="LISTAR_USUARIOS", query = ""
			+ "SELECT id, nome, cpf, email, contato, cep, cidade, bairro, uf, logradouro, complemento FROM user", resultClass = User.class),
	@NamedNativeQuery(name="INSERIR_USUARIO", query = ""
			+ "INSERT INTO user (nome, cpf, email, contato, cep, cidade, bairro, uf, logradouro, complemento) values "
			+ "(:nome, :cpf, :email, :contato, :cep, :cidade, :bairro, :uf, :logradouro, :complemento)"),
})
public class User extends PanacheEntityBase {

	@Id
	@GeneratedValue(generator = "UUID")
	@GenericGenerator(
			name = "UUID",
			strategy = "org.hibernate.id.UUIDGenerator"
			)
	private UUID id;
	
	@Column(name="nome", length = 100, nullable = false)
	private String nome;
	
	@Column(name="cpf", nullable = false, unique = true)
	private BigInteger cpf;
	
	@Column(name="email")
	private String email;
	
	@Column(name="contato")
	private int contato;
	
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
	
	@Column(name="complemento")
	private String complemento;
	
	public User() {
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

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public BigInteger getCpf() {
		return cpf;
	}

	public void setCpf(BigInteger cpf) {
		this.cpf = cpf;
	}

	public int getContato() {
		return contato;
	}

	public void setContato(int contato) {
		this.contato = contato;
	}

}
