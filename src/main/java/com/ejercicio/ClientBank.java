package com.ejercicio;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;


@Entity
@Table(name = "client_bank")
public class ClientBank {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
	private Integer idCli;
	
	private String nombre;
	private String email;
	private String cuenta;
	
	public ClientBank() {
		super();
	}
	
	public ClientBank(String nombre, String email, String cuenta) {
		this.nombre = nombre;
		this.email = email;
		this.cuenta = cuenta;
	}
	
	public Integer getIdCli() {
		return idCli;
	}
	public void setIdCli(Integer idCli) {
		this.idCli = idCli;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCuenta() {
		return cuenta;
	}
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
	
	
	
}
