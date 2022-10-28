package com.nttdata.tomcat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Segundo Servlet - FP Dual
 * @author Santiago López Arredondo
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
	 * Este método escucha peticiones HTTP a través de GET
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * @param request
	 * @param response
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Definimos la respuesta a la petición
		response.getWriter().append("MI SEGUNDO SERVLET | GET");
	}

	/**
	 * Este método escucha peticiones HTTP a través de POST
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Gracias a este método podremos obtener el input del usuario en el campo "nombreUsuario" devuelto en forma de String
		String nombre = request.getParameter("nombreUsuario");
		
		// Realizamos una pequeña comprobación para modificar la respuesta a la petición en funció de
		// los parámetros introducidos por el usuario
		if (nombre == null || nombre.isBlank()) {
			response.getWriter().append("Porfavor, recarga la página y escribe tu nombre para poder darte la bienvenida");
			
		} else {		
			// Para devolver el saludo, vamos a emplear el método estático "helloNTTData" de la clase "NTTDataJSP"
			response.getWriter().append(NTTDataJSP.helloNTTData(nombre));
			
		}
	}

}
