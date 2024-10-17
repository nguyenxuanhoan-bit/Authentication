/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package hoan.dev;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
@WebServlet(name = "DemoSever1", urlPatterns = {"/DemoSever1"})
public class DemoSever1 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
@Override
public void doGet(HttpServletRequest request,
                  HttpServletResponse response)
    throws ServletException, IOException {
    // Servlet code
    PrintWriter out = response.getWriter();
    String yourname = request.getParameter("yourname");
    String password = request.getParameter("password");
    out.println(String.format("<h1>youname: %s - Password: %s</h1>", yourname, password));
    
    
}

@Override
public void doPost(HttpServletRequest request,
                   HttpServletResponse response)
    throws ServletException, IOException {
    // Servlet code
    PrintWriter out = response.getWriter();
    String yourname = request.getParameter("yourname");
    String password = request.getParameter("password");
    out.println(String.format("<h1>youname: %s - Password: %s</h1>", yourname, password));
}

}
