package modelo.fichadas;

import java.math.BigDecimal;
import modelo.TarjetaSube;

public class TransaccionSUBE {
	
	private int idTransaccion;
	private Fichada fichada;
	private BigDecimal importe;
	private TarjetaSube tarjeta;
	
	public TransaccionSUBE() {}
	
	public TransaccionSUBE(Fichada fichada, BigDecimal importe) {
		super();
		this.fichada = fichada;
		this.importe = importe;
	}

	public int getIdTransaccion() {
		return idTransaccion;
	}
	
	protected void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	
	public Fichada getFichada() {
		return fichada;
	}
	
	public void setFichada(Fichada fichada) {
		this.fichada = fichada;
	}
	
	public BigDecimal getImporte() {
		return importe;
	}
	
	public void setImporte(BigDecimal importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "TransaccionSUBE [fichada =" + fichada.toString() + ", importe=" + importe + "]";
	}
	
}
