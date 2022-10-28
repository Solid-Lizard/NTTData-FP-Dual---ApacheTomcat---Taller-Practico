package com.nttdata.tomcat;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Primer Servlet - FP Dual
 * @author Santiago López Arredondo
 * @version 1.0
 */
@WebServlet("/NTTDataServlet")
public class NTTDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * Constructor por defecto del servlet.
     * @see HttpServlet#HttpServlet()
     */
    public NTTDataServlet() {
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
		// Definimos la respuesta a a petición
		response.getWriter().append("MI PRIMER SERVLET | GET");		
	
	}

	/**
	 * Este método escucha peticiones HTTP a través de POST
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * @param request
	 * @param response
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		//No vamos a emplear la misma respuesta que usamos en el "get" ya que queremos modificar un poco el mensaje para 
		//la petición "POST"
		
		//doGet(request, response);
		
		//Definimos la respuesta a la petición
		response.getWriter().append("MI PRIMER SERVLET | POST");		
	}

}
