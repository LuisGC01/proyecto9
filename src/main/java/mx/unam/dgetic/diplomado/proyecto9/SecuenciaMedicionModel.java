package mx.unam.dgetic.diplomado.proyecto9;

import java.io.Serializable;
import java.util.Date;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class SecuenciaMedicionModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3155615630401064796L;
	private Integer idSecuenciaMedicion;
	private String titulo;
	private String descripcion;
	private Date fecha;
	private Integer idUsuario;

	public SecuenciaMedicionModel() {
		// TODO Auto-generated constructor stub
	}

	public SecuenciaMedicionModel(Integer idSecuenciaMedicion, String titulo, String descripcion, Date fecha,
			Integer idUsuario) {
		this.idSecuenciaMedicion = idSecuenciaMedicion;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.fecha = fecha;
		this.idUsuario = idUsuario;
	}

	public Integer getIdSecuenciaMedicion() {
		return idSecuenciaMedicion;
	}

	public void setIdSecuenciaMedicion(Integer idSecuenciaMedicion) {
		this.idSecuenciaMedicion = idSecuenciaMedicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

}
