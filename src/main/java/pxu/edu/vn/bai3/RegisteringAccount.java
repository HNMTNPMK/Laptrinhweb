package pxu.edu.vn.bai3;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegisteringAccount extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException { 
        String ho = request.getParameter("ho");
        String ten = request.getParameter("ten");
        String ngaysinh = request.getParameter("ngaysinh");
        String gioitinh = request.getParameter("gioitinh");
        String email = request.getParameter("email");
        String taikhoan = request.getParameter("taikhoan");
        String matkhau = request.getParameter("matkhau");
        
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Đăng ký tài khoản</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Đăng ký tài khoản thành công</h1>");
        out.println("<p>Họ: " + ho + "</p>");
        out.println("<p>Tên: " + ten + "</p>");
        out.println("<p>Ngày sinh: " + ngaysinh + "</p>");
        out.println("<p>Giới tính: " + gioitinh + "</p>");
        out.println("<p>Email: " + email + "</p>");
        out.println("<p>Tên tài khoản: " + taikhoan + "</p>");
        out.println("</body>");
        out.println("</html>");
    }
}