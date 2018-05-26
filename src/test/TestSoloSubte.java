package test;

import java.math.BigDecimal;
import java.util.GregorianCalendar;

import modelo.Persona;
import modelo.TarjetaSube;
import modelo.Descuentos.DescuentoTarifaSocial;
import modelo.fichadas.TransaccionSUBE;
import modelo.fichadas.subte.EstacionSubte;
import modelo.fichadas.subte.FichadaSubte;
import modelo.fichadas.subte.LineaSubte;

public class TestSoloSubte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Instancia de objetos para fichada subte--------------------------------------------------
		// TODO Auto-generated method stub
		Persona persona = new Persona();
		persona.asignarDescuentoTarifaSocial(new DescuentoTarifaSocial ("Descuento Tarifa Social", 55));
		
		TarjetaSube tarjeta = new TarjetaSube("9999",new BigDecimal (-15));
		
		tarjeta.setPropietario(persona);
		
		
				
		
		LineaSubte lineaC = new LineaSubte ("Linea C", new BigDecimal(11));						 
		EstacionSubte constitucion= new EstacionSubte("Constitucion", lineaC); 
		EstacionSubte moreno = new EstacionSubte("Moreno", lineaC); 
		lineaC.getRecorridoSubte().add(constitucion);
		lineaC.getRecorridoSubte().add(moreno);
		FichadaSubte fichadaSubte = new FichadaSubte (new GregorianCalendar(2018, 3, 6, 13,10,00), constitucion);		
		TransaccionSUBE transaccionPrueba = tarjeta.procesarFichada(fichadaSubte);
		if ( transaccionPrueba != null) {
			System.out.print(transaccionPrueba.toString());
			}
	}	
}