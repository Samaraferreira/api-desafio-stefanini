package br.com.stefanini.maratonadev.model;

import java.math.BigInteger;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

@Entity
@Table(name="historico")
public class Historico extends PanacheEntityBase {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "user_cpf", unique = true, nullable = false)
	private BigInteger userCpf;
 
    @Column(name = "placa_carro", unique = true, nullable = false)
    private String placaCarro;
    
    @Column(name="data_aluguel", nullable = false, updatable = false)
	@CreationTimestamp
	private LocalDateTime dataAluguel;

	public Historico() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigInteger getUserCpf() {
		return userCpf;
	}

	public void setUserCpf(BigInteger userCpf) {
		this.userCpf = userCpf;
	}

	public String getPlacaCarro() {
		return placaCarro;
	}

	public void setPlacaCarro(String placaCarro) {
		this.placaCarro = placaCarro;
	}

	public LocalDateTime getDataAluguel() {
		return dataAluguel;
	}

	public void setDataAluguel(LocalDateTime dataAluguel) {
		this.dataAluguel = dataAluguel;
	}

}
