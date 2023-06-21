	package pxu.edu.vn.bai2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloForm
 */
@WebServlet("/helloForm")
public class helloForm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
    * @see HttpServlet#doGet(HttpServletRequest request,

    HttpServletResponse response)

    */
    protected void doGet(HttpServletRequest request, HttpServletResponse
    response)    throws ServletException, IOException {
    // TODO Auto-generated method stub
    response.setContentType("hello.html");
    PrintWriter out = response.getWriter();
    String title = "USING GET METHOD TO READ DATA";
    String docType = "<!doctype html public \"-//w3c//dtd html4.0 " +
    "transitional//en\">\n";
    out.println(docType +

    "<html>\n" +
    "<head><title>" + title + "</title></head>\n" +
    "<body bgcolor=\"#f0f0f0\">\n" +
    "<h1 align=\"center\">" + title + "</h1>\n" +
    "<ul>\n" +
    " <li><b>First Name</b>: "
    + request.getParameter("first_name") + "\n" +
    " <li><b>Last Name</b>: "
    + request.getParameter("last_name") + "\n" +
    "</ul>\n" +
    "</body></html>");
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}