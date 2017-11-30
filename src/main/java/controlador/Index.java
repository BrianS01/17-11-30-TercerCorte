/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SERGIO
 */
public class Index extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
        
            int cliente;
            int siniestro;
            int vehiculo;

            if (request.getParameter("cliente") == null) {
                cliente = 0;
            } else {
                cliente = Integer.parseInt(request.getParameter("cliente"));

            }
            if (cliente == 1) {
                request.getRequestDispatcher("Cliente.jsp").forward(request, response);
            }

             if (request.getParameter("vehiculo") == null) {
                siniestro = 0;
            } else {
                siniestro = Integer.parseInt(request.getParameter("vehiculo"));

            }
            if (siniestro == 2) {
                request.getRequestDispatcher("Vehiculo.jsp").forward(request, response);
            }
   
            if (request.getParameter("siniestro") == null) {
                vehiculo = 0;
            } else {
                vehiculo = Integer.parseInt(request.getParameter("siniestro"));

            }
            if (vehiculo == 3) {
                request.getRequestDispatcher("Siniestro.jsp").forward(request, response);
            }
            
            
        }

    }

}
