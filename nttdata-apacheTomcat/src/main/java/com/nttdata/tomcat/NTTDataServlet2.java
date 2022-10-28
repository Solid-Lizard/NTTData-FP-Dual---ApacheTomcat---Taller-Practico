package com.nttdata.tomcat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Segundo Servlet - FP Dual
 * @author Santiago L�pez Arredondo
 * @version 1.0
 */
@WebServlet("/NTTDataServlet2")
public class NTTDataServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
     * Constructor por defecto del servlet.
     * @see HttpServlet#HttpServlet()
     */
    public NTTDataServlet2() {
        super();
 
    }

    /**
	 * Este m�todo escucha peticiones HTTP a trav�s de GET
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * @param request
	 * @param response
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Definimos la respuesta a la petici�n
		response.getWriter().append("MI SEGUNDO SERVLET | GET");
	}

	/**
	 * Este m�todo escucha peticiones HTTP a trav�s de POST
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Gracias a este m�todo podremos obtener el input del usuario en el campo "nombreUsuario" devuelto en forma de String
		String nombre = request.getParameter("nombreUsuario");
		
		// Realizamos una peque�a comprobaci�n para modificar la respuesta a la petici�n en funci� de
		// los par�metros introducidos por el usuario
		if (nombre == null || nombre.isBlank()) {
			response.getWriter().append("Porfavor, recarga la p�gina y escribe tu nombre para poder darte la bienvenida");
			
		} else {		
			// Para devolver el saludo, vamos a emplear el m�todo est�tico "helloNTTData" de la clase "NTTDataJSP"
			response.getWriter().append(NTTDataJSP.helloNTTData(nombre));
			
		}
	}

}
