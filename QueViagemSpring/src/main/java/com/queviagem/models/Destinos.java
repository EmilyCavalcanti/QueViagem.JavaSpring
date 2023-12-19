package com.queviagem.models;

	import java.math.BigDecimal;
import java.util.List;

import com.queviagem.models.Destinos;
	
	import org.springframework.format.annotation.NumberFormat;
	import org.springframework.format.annotation.NumberFormat.Style;
	import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

	@Entity
	public class Destinos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "pais", nullable = false)
	private String pais;
	
	@Column(name = "cidade", nullable = false)
	private String cidade;
	
	@Column(nullable = false)
    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private BigDecimal valor;
	
	@Column(nullable = false)
//    @NumberFormat(style = Style.CURRENCY, pattern = "#,##0.00")
	private boolean promocoes;
	
	@OneToMany
	private List <Viagem> viagens;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public boolean getPromocoes() {
		return promocoes;
	}

	public void setPromocoes(boolean promocoes) {
		this.promocoes = promocoes;
	}
	
	}
	
	