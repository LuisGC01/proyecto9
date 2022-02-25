package mx.unam.dgetic.diplomado.proyecto9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named
@SessionScoped
public class ListadoSecuencias implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8491807972512926579L;

	private List<SecuenciaMedicionModel> secuencias;

	public ListadoSecuencias() {
		// TODO Auto-generated constructor stub
		secuencias = new ArrayList<SecuenciaMedicionModel>();
		secuencias.add(new SecuenciaMedicionModel(1, "Titulo secuencia 1", "Descripcion de la secuencia de medicion 1",
				new Date(), 1));
		secuencias.add(new SecuenciaMedicionModel(2, "Titulo secuencia 2", "Descripcion de la secuencia de medicion 2",
				new Date(), 2));
	}

	public List<SecuenciaMedicionModel> getSecuencias() {
		return secuencias;
	}

	public void setSecuencias(List<SecuenciaMedicionModel> secuencias) {
		this.secuencias = secuencias;
	}

	public void add(SecuenciaMedicionModel e) {
		secuencias.add(e);
	}

}
