package mx.unam.dgetic.diplomado.proyecto9;

import java.io.Serializable;
import java.util.Objects;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class Usuario implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2017067021225263600L;

	private String nombreUsuario;

	private String password;

	private String puesto;

	private String nombre;

	private String primerApellido;

	private String segundoApellido;

	private Boolean activo;

	@Inject
	private ListadoUsuarios listado;

	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	public Usuario(String nombreUsuario, String password, String puesto, String nombre, String primerApellido,
			String segundoApellido, Boolean activo) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.puesto = puesto;
		this.nombre = nombre;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.activo = activo;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public ListadoUsuarios getListado() {
		return listado;
	}

	public void setListado(ListadoUsuarios listado) {
		this.listado = listado;
	}

	public String registrar() {
		listado.agregar(
				new UsuarioModel(nombreUsuario, password, puesto, nombre, primerApellido, segundoApellido, activo));
		listado.getUsuarios().forEach(System.out::println);
		System.out.println("Usuario agregado correctamente");
		return "index";
	}

	@Override
	public int hashCode() {
		return Objects.hash(activo, nombre, nombreUsuario, password, primerApellido, puesto, segundoApellido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(activo, other.activo) && Objects.equals(nombre, other.nombre)
				&& Objects.equals(nombreUsuario, other.nombreUsuario) && Objects.equals(password, other.password)
				&& Objects.equals(primerApellido, other.primerApellido) && Objects.equals(puesto, other.puesto)
				&& Objects.equals(segundoApellido, other.segundoApellido);
	}

	@Override
	public String toString() {
		return "Usuario [nombreUsuario=" + nombreUsuario + ", password=" + password + ", puesto=" + puesto + ", nombre="
				+ nombre + ", primerApellido=" + primerApellido + ", segundoApellido=" + segundoApellido + ", activo="
				+ activo + "]";
	}

}
