package co.edu.udea.iw.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClienteWS {
	/**
	 * Cedula del cliente
	 */
	private String cedula;
	/**
	 * Primer nombre del cliente
	 */
	private String nombres;
	/**
	 * Apellidos completos del cliente
	 */
	private String apellidos;
	/**
	 * Dirección de correo electrónico del cliente
	 */
	private String correoElectronico;
	/**
	 * Referencia del usuario del sistema que crea el cliente
	 */
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
}
