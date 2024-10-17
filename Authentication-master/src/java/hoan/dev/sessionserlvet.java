package hoan.dev;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 * Servlet to manage session and increment an attribute.
 */
@WebServlet(name = "sessionserlvet", urlPatterns = {"/sessionserlvet"})
public class sessionserlvet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("a") == null) {
            int a = 0;
            session.setAttribute("a", a);
        } else {
            int a = (int) session.getAttribute("a");
            a++;
            session.setAttribute("a", a);
        }
        
        // Write response
        try (PrintWriter out = response.getWriter()) {
            int a = (int) session.getAttribute("a");
            out.print(a);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // You can handle POST requests here, or leave this empty if not needed.
    }

    @Override
    public String getServletInfo() {
        return "Session Servlet that increments a session attribute.";
    }
}
