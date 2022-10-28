package com.nttdata.tomcat;

/**
 * Clase NTTDataJSP - FP Dual
 * @author Santiago López Arredondo
 * @version 1.0
 */
public class NTTDataJSP {
	
	/**
	 * Constructor por defecto
	 */	
	public NTTDataJSP() {}
	
	/**
	 * Este método devuelve un saludo con el nombre definido por el parámetro
	 * 
	 * @param nombre - String - Nombre que se añadirá al saludo 
	 * @return Un saludo con el nombre añadido
	 */
	public static String helloNTTData(String nombre) {
		
		return "¡Bienvenido a NTTData " + nombre +"!";
	}
}
