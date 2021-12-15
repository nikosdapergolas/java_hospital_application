package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserServlet
 */
@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public UserServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("firstName");
//		String surname=request.getParameter("lastName");
		String randomShit = "TEST";
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head> <title> information page!! </title> </head>"
				+ "<body>"
				+ "<h1>Hello! Here are the information we have about you! </h1>"
				+ "</body>"
				+ "</html>"
				+ "");
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}



//** PALIO PARADEIGMA KWDIKA MESA STA STRINGS **
	//"<html>" +
	//"<head><title> This is an example of reading parameters from a form using the GET method</title></head>" +
	//"<h1> Hello " + name + " " + surname + " coming from " + request.getRemoteHost() + ":" + request.getRemotePort() + "</h1>"
	//+"</html>"
//-------------------------------------------------------------------------------------------------------------------------
//** OLH H METHODOS doGet OPOS THA THN KANW ME MONADIKH PARALLAGH TO STRING MESA STO out.println("") **
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	// TODO Auto-generated method stub
	//	//response.getWriter().append("Served at: ").append(request.getContextPath());
	//	response.setCharacterEncoding("UTF-8");
	//	PrintWriter out = response.getWriter();
	//	String name = request.getParameter("firstName");
	//	String surname=request.getParameter("lastName");
	//	String randomShit = "TEST";
	//	out.println("<!DOCTYPE html>"
	//			+ "<html>"
	//			+ "<body>"
	//			+ "<h1>This is heading 1</h1>"
	//			+ "<h2>This is heading 2</h2>"
	//			+ "<h3>This is heading 3</h3>"
	//			+ "<h4>This is heading 4</h4>"
	//			+ "<h5>This is heading 5</h5>"
	//			+ "<h6>This is heading 6</h6>"
	//			+ "<h1> this is some random shit:" + randomShit + ". ok? </h1>"
	//			+ "</body>"
	//			+ "</html>"
	//			+ "");
	//			
	//}