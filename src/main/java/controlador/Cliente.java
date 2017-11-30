/*
 *  Proyecto Tercer Corte
 *   co-Author :::   Juan Albarracin
 *   co-Author :::  Mario Bolaños
 *   co-Author ::: Sergio Orozco
 *   co-Author :::  Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package controlador;

import dao.CRUDCliente;
import Datos.Tomador;
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
public class Cliente extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try (PrintWriter out = response.getWriter()) {

            int documento = 0;
            String tipoDocumento = null;
            String nombre = null;
            String apellido = null;
            String direccion = null;
            int telefono = 0;
            String fechanacimiento = null;
            int edadA = 0;

            if (request.getParameter("documento") == null) {

            } else {
                documento = Integer.parseInt(request.getParameter("documento"));

            }

            if (request.getParameter("tipoDocumento") == null) {

            } else {
                tipoDocumento = request.getParameter("tipoDocumento");

            }

            if (request.getParameter("nombre") == null) {

            } else {
                nombre = request.getParameter("nombre");

            }

            if (request.getParameter("apellido") == null) {

            } else {
                apellido = request.getParameter("apellido");

            }

            if (request.getParameter("direccion") == null) {

            } else {
                direccion = request.getParameter("direccion");

            }

            if (request.getParameter("telefono") == null) {

            } else {
                telefono = Integer.parseInt(request.getParameter("telefono"));

            }

            if (request.getParameter("fechanacimiento") == null) {

            } else {
                fechanacimiento = request.getParameter("fechanacimiento");

            }

            if (request.getParameter("edadA") == null) {

            } else {
                edadA = Integer.parseInt(request.getParameter("edadA"));

            }

            Tomador nm = new Tomador(0, edadA, 0, 0, documento, tipoDocumento, nombre, apellido, direccion, telefono, fechanacimiento);
            CRUDCliente c=new CRUDCliente();
            try {
                c.insert(nm);
                System.out.println("hola");
            } catch (SQLException ex) {
                Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            }

            
            String total="El usuario a sido reguistrado";
            request.setAttribute("total", total);
            request.getRequestDispatcher("Cliente.jsp").forward(request, response);
            
            
            
        
        }
    }

}
