package mx.unam.dgetic.diplomado.proyecto9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ArregloMedicionDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6374133391786598099L;
	private Integer idArregloMedicion;
	private String titulo;
	private Date fecha;
	private String version;
	private String descripcion;
	private String formatoCalCert;
	private Integer idUsuario;
	private Integer idImagen;

	@Inject
	private ListadoArreglos listado;

	public ArregloMedicionDTO() {
		// TODO Auto-generated constructor stub
		List<ArregloMedicionModel> arreglosMedicion = new ArrayList<ArregloMedicionModel>();
		arreglosMedicion.add(new ArregloMedicionModel(1, "Arreglo1", new Date(), "1.0.0", "Decripcion 1",
				"../formatos_cal_cert/formato1.pdf", 1, 1));
		arreglosMedicion.add(new ArregloMedicionModel(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2",
				"../formatos_cal_cert/formato2.pdf", 2, 4));
		listado.setArreglos(arreglosMedicion);
	}

	public ArregloMedicionDTO(Integer idArregloMedicion, String titulo, Date fecha, String version, String descripcion,
			String formatoCalCert, Integer idUsuario, Integer idImagen) {
		this.idArregloMedicion = idArregloMedicion;
		this.titulo = titulo;
		this.fecha = fecha;
		this.version = version;
		this.descripcion = descripcion;
		this.formatoCalCert = formatoCalCert;
		this.idUsuario = idUsuario;
		this.idImagen = idImagen;
	}

	public Integer getIdArregloMedicion() {
		return idArregloMedicion;
	}

	public void setIdArregloMedicion(Integer idArregloMedicion) {
		this.idArregloMedicion = idArregloMedicion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getFormatoCalCert() {
		return formatoCalCert;
	}

	public void setFormatoCalCert(String formatoCalCert) {
		this.formatoCalCert = formatoCalCert;
	}

	public Integer getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Integer idUsuario) {
		this.idUsuario = idUsuario;
	}

	public Integer getIdImagen() {
		return idImagen;
	}

	public void setIdImagen(Integer idImagen) {
		this.idImagen = idImagen;
	}

	public ListadoArreglos getListado() {
		return listado;
	}

	public void setListado(ListadoArreglos listado) {
		this.listado = listado;
	}

}
