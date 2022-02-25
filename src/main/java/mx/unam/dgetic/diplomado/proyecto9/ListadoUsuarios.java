package mx.unam.dgetic.diplomado.proyecto9;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ListadoUsuarios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5034042475879127113L;
	
	private List<UsuarioModel> usuarios;
	
	public ListadoUsuarios() {
		// TODO Auto-generated constructor stub
		usuarios = new LinkedList<UsuarioModel>();
	}

	public List<UsuarioModel> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<UsuarioModel> usuarios) {
		this.usuarios = usuarios;
	}
	
	public void agregar(UsuarioModel u) {
		usuarios.add(u);
	}
	

}
