/*
 *      Author ::: Brian Sterling
 *     Program ::: Bases de Datos
 *  Credential ::: SIST0008-G01:SIV
 */

package controlador;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DetalleDAO;
import modelo.Detalle;

public class DetalleControlador extends HttpServlet
{
    private static final long serialVersionUID = 1L;
    private static String INSERT_OR_EDIT = "/ventaAgregarLocal.jsp";
    private static String LIST_USER = "/ventaListarLocal.jsp";
    private DetalleDAO dao;

    public DetalleControlador()
    {
        super();
        dao = new DetalleDAO();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        String forward = "";
        String action = request.getParameter("action");
        
        if (action.equalsIgnoreCase("delete"))
        {
            int userId = Integer.parseInt(request.getParameter("idDetalle"));
            dao.deleteUser(userId);
            forward = LIST_USER;
            request.setAttribute("detalle", dao.getAllUsers());
        }
        else if (action.equalsIgnoreCase("edit"))
        {
            forward = INSERT_OR_EDIT;
            int userId = Integer.parseInt(request.getParameter("idDetalle"));
            Detalle user = dao.getUserById(userId);
            request.setAttribute("user", user);
        }
        else if (action.equalsIgnoreCase("listUser"))
        {
            forward = LIST_USER;
            request.setAttribute("detalle", dao.getAllUsers());
        }
        else
        {
            forward = INSERT_OR_EDIT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        Detalle user = new Detalle();
        user.setNombreCliente(request.getParameter("nombreCliente"));
        user.setFecha(request.getParameter("fecha"));
        String idDetalle = request.getParameter("idDetalle");
        
        if (idDetalle == null || idDetalle.isEmpty())
        {
            dao.addUser(user);
        }
        else
        {
            user.setIdDetalle(Integer.parseInt(idDetalle));
            dao.updateUser(user);
        }
        
        String cedula = request.getParameter("cedula");
        
        if (cedula == null || cedula.isEmpty())
        {
            dao.addUser(user);
        }
        else
        {
            user.setIdDetalle(Integer.parseInt(cedula));
            dao.updateUser(user);
        }
        
        RequestDispatcher view = request.getRequestDispatcher(LIST_USER);
        request.setAttribute("detalle", dao.getAllUsers());
        view.forward(request, response);
    }
}