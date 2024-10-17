package hoan.dev;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 *
 * @author PC
 */
public class AServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    // Phương thức xử lý yêu cầu POST
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // Lấy giá trị từ form
        String numberStr = request.getParameter("number");
        int number = Integer.parseInt(numberStr);

        // Thiết lập kiểu nội dung trả về là HTML
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        // In ra tiêu đề
        out.println("<html><body>");
        out.println("<h1>Cửu chương " + number + "</h1>");

        // Tính và in ra bảng cửu chương
        for (int i = 1; i <= 10; i++) {
            out.println(number + " x " + i + " = " + (number * i) + "<br>");
        }

        out.println("</body></html>");
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Nếu bạn không muốn xử lý GET, có thể in thông báo
        response.getWriter().println("Phương thức GET không được hỗ trợ.");
    }

    /**
     * Trả về mô tả ngắn về servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Servlet để in bảng cửu chương theo số đã nhập.";
    }
    // </editor-fold>
}
