package modelo.fichadas.tren;
import java.util.GregorianCalendar;

import modelo.fichadas.Fichada;
import modelo.fichadas.tren.EstacionTren;

public  class FichadaTren extends Fichada {
	public enum eTipoFichadaTren {ENTRADA,SALIDA};
	
	private EstacionTren estacion;
	private eTipoFichadaTren tipoFichada;
	
	public FichadaTren(GregorianCalendar fechaHora, EstacionTren estacion, eTipoFichadaTren tipoFichada) {
		super(fechaHora);
		this.estacion = estacion;
		this.tipoFichada = tipoFichada;
	}

	public eTipoFichadaTren getTipoFichada() {
		return tipoFichada;
	}

	public void setTipoFichada(eTipoFichadaTren tipoFichada) {
		this.tipoFichada = tipoFichada;
	}

	public EstacionTren getEstacion() {
		return estacion;
	}
	
	public void setEstacion(EstacionTren estacion) {
		this.estacion = estacion;
	}

	@Override
	public String toString() {
		return "FichadaTren [estacion=" + estacion + ", tipoFichada=" + tipoFichada + "]";
	}
	
}
