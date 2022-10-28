package com.nttdata.tomcat;

/**
 * Clase NTTDataJSP - FP Dual
 * @author Santiago L�pez Arredondo
 * @version 1.0
 */
public class NTTDataJSP {
	
	/**
	 * Constructor por defecto
	 */	
	public NTTDataJSP() {}
	
	/**
	 * Este m�todo devuelve un saludo con el nombre definido por el par�metro
	 * 
	 * @param nombre - String - Nombre que se a�adir� al saludo 
	 * @return Un saludo con el nombre a�adido
	 */
	public static String helloNTTData(String nombre) {
		
		return "�Bienvenido a NTTData " + nombre +"!";
	}
}
