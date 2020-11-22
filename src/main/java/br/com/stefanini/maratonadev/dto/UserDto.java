package br.com.stefanini.maratonadev.dto;

import java.math.BigInteger;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.com.stefanini.maratonadev.model.Endereco;

public class UserDto {
	
	@NotNull(message = "Nome é Obrigatorio")
	@NotBlank(message = "Não é permito nome vazio")
	@Length(min = 3, max = 100, message = "Não é permido nomes "
			+ "menores que 3 caracteres ou maiores que 100")
	private String nome;
	
	private BigInteger cpf;

	private String email;

	private int contato;
	
	private Endereco endereco;

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
