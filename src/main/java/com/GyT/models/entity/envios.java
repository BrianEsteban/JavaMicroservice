package com.GyT.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="envios")
public class envios implements Serializable{
	                     	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int  idenvios;
	
	@Column(name = "proveedor" )
	private String proveedor;
	
	@Column(name = "nombre_remitente" )
	private String nombre_remitente;
	
	@Column(name = "celular_remitente" )
	private String celular_remitente;
	
	@Column(name = "nombre_destinatario" )
	private String nombre_destinatario;
	
	@Column(name = "celular_destinatario" )
	private String celular_destinatario;
	
	@Column(name = "direccion_destinatario" )
	private String direccion_destinatario;
	
	@Column(name = "tipo_de_envio" )
	private String tipo_de_envio;
	
	@Column(name = "peso" )
	private int peso;
	
	@Column(name = "caracteristicas_envio" )
	private String caracteristicas_envio;
	
	@Column(name = "ciudad_origen" )
	private String ciudad_origen;
	
	@Column(name = "ciudad_destino" )
	private String ciudad_destino;
	
	@Column(name = "forma_de_pago" )
	private String forma_de_pago;

	
	//getters setters
	public int getIdenvios() {
		return idenvios;
	}

	public void setIdenvios(int idenvios) {
		this.idenvios = idenvios;
	}

	public String getProveedor() {
		return proveedor;
	}

	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}

	public String getNombre_remitente() {
		return nombre_remitente;
	}

	public void setNombre_remitente(String nombre_remitente) {
		this.nombre_remitente = nombre_remitente;
	}

	public String getCelular_remitente() {
		return celular_remitente;
	}

	public void setCelular_remitente(String celular_remitente) {
		this.celular_remitente = celular_remitente;
	}

	public String getNombre_destinatario() {
		return nombre_destinatario;
	}

	public void setNombre_destinatario(String nombre_destinatario) {
		this.nombre_destinatario = nombre_destinatario;
	}

	public String getCelular_destinatario() {
		return celular_destinatario;
	}

	public void setCelular_destinatario(String celular_destinatario) {
		this.celular_destinatario = celular_destinatario;
	}

	public String getDireccion_destinatario() {
		return direccion_destinatario;
	}

	public void setDireccion_destinatario(String direccion_destinatario) {
		this.direccion_destinatario = direccion_destinatario;
	}

	public String getTipo_de_envio() {
		return tipo_de_envio;
	}

	public void setTipo_de_envio(String tipo_de_envio) {
		this.tipo_de_envio = tipo_de_envio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getCaracteristicas_envio() {
		return caracteristicas_envio;
	}

	public void setCaracteristicas_envio(String caracteristicas_envio) {
		this.caracteristicas_envio = caracteristicas_envio;
	}

	public String getCiudad_origen() {
		return ciudad_origen;
	}

	public void setCiudad_origen(String ciudad_origen) {
		this.ciudad_origen = ciudad_origen;
	}

	public String getCiudad_destino() {
		return ciudad_destino;
	}

	public void setCiudad_destino(String ciudad_destino) {
		this.ciudad_destino = ciudad_destino;
	}

	public String getForma_de_pago() {
		return forma_de_pago;
	}

	public void setForma_de_pago(String forma_de_pago) {
		this.forma_de_pago = forma_de_pago;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "envios [idenvios=" + idenvios + ", proveedor=" + proveedor + ", nombre_remitente=" + nombre_remitente
				+ ", celular_remitente=" + celular_remitente + ", nombre_destinatario=" + nombre_destinatario
				+ ", celular_destinatario=" + celular_destinatario + ", direccion_destinatario="
				+ direccion_destinatario + ", tipo_de_envio=" + tipo_de_envio + ", peso=" + peso
				+ ", caracteristicas_envio=" + caracteristicas_envio + ", ciudad_origen=" + ciudad_origen
				+ ", ciudad_destino=" + ciudad_destino + ", forma_de_pago=" + forma_de_pago + "]";
	}
	
}
