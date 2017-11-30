/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import dao.CRUDCliente;
import dao.CRUDSiniestro;
import Datos.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SERGIO
 */
public class Siniestro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {
            String lugar = null;
            String fecha = null;
            int hora = 0;

            if (request.getParameter("lugar") == null) {

            } else {
                lugar = request.getParameter("lugar");

            }
            if (request.getParameter("fecha") == null) {

            } else {
                fecha = request.getParameter("fecha");

            }

            if (request.getParameter("hora") == null) {

            } else {
                hora = Integer.parseInt(request.getParameter("hora"));

            }

            Siniestro n = new Siniestro();
            CRUDSiniestro s = new CRUDSiniestro();
            s.insert(n);
            System.out.println("hola");

            String total = "El usuario a sido reguistrado";
            request.setAttribute("total", total);
            request.getRequestDispatcher("Siniestro.jsp").forward(request, response);

        }
    }

}
