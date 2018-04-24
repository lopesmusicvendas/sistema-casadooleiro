package com.br.simfini.models;


import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ServicosMedicos {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String clinica;
	private String tipo;
	private int ch;
	private long amb;
	private BigDecimal valorClinica;
	private BigDecimal valorOleiro;
	private BigDecimal valorParticular;
	private String medico;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getAmb() {
		return amb;
	}
	public void setAmb(long amb) {
		this.amb = amb;
	}
	public String getMedico() {
		return medico;
	}
	public void setMedico(String medico) {
		this.medico = medico;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public String getClinica() {
		return clinica;
	}
	public void setClinica(String clinica) {
		this.clinica = clinica;
	}
		
	public BigDecimal getValorClinica() {
		return valorClinica;
	}
	public void setValorClinica(BigDecimal valorClinica) {
		this.valorClinica = valorClinica;
	}
	public BigDecimal getValorOleiro() {
		return valorOleiro;
	}
	public void setValorOleiro(BigDecimal valorOleiro) {
		this.valorOleiro = valorOleiro;
	}
	public BigDecimal getValorParticular() {
		return valorParticular;
	}
	public void setValorParticular(BigDecimal valorParticular) {
		this.valorParticular = valorParticular;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return tipo +","+ ch +","+ valorOleiro +","+ valorParticular +","+ valorClinica +","+ medico ;
	}
	
}
