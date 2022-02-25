package mx.unam.dgetic.diplomado.proyecto9;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;


@Named
@SessionScoped
public class ListadoArreglos implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5658037989783764202L;
	
	private List<ArregloMedicionModel> arreglos=new ArrayList<ArregloMedicionModel>();
	
	public ListadoArreglos() {
		// TODO Auto-generated constructor stub
		arreglos.add(new ArregloMedicionModel(1, "Arreglo1", new Date(), "1.0.0", "Decripcion 1", "../formatos_cal_cert/formato1.pdf", 1, 1));
		arreglos.add(new ArregloMedicionModel(2, "Arreglo2", new Date(), "1.0.0", "Decripcion 2", "../formatos_cal_cert/formato2.pdf", 2, 4));

	}

	public List<ArregloMedicionModel> getArreglos() {
		return arreglos;
	}

	public void setArreglos(List<ArregloMedicionModel> arreglos) {
		this.arreglos = arreglos;
	}
	
	public void agregar(ArregloMedicionModel a) {
		arreglos.add(a);
	}

}
