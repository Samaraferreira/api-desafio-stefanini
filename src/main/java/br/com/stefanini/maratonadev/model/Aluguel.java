package br.com.stefanini.maratonadev.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Table(name="aluguel")
public class Aluguel extends PanacheEntity {
	
	@Column(name = "user_id", unique = true, nullable = false)
	private UUID userId;
 
    @Column(name = "placa_carro", unique = true, nullable = false)
    private String placa_carro;

    
	public Aluguel() {
		super();
	}

	public UUID getUserId() {
		return userId;
	}

	public void setUserId(UUID userId) {
		this.userId = userId;
	}

	public String getPlaca_carro() {
		return placa_carro;
	}

	public void setPlaca_carro(String placa_carro) {
		this.placa_carro = placa_carro;
	}

}
