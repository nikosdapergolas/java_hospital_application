package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
//import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Servlet implementation class PatientServlet
 */
@WebServlet("/PatientServlet")
public class PatientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public PatientServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("firstName");
		String infobutton = request.getParameter("infoButton");
		//String surname = request.getParameter("lastName");
		out.println("<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<title> HomePage </title>"
				+ "<meta charset=\"utf-8\">"
				+ "<style>"
				+ "    h1, h2, h3 , h4{"
				+ "      color:white;"
				+ "      text-align:center;"
				+ "    }"
				+ "    body {"
				+ "      background-image: url(\"doc.jpeg\");"
				+ "        background-size:100%;\r\n"
				+ "        background-repeat: no-repeat;"
				+ "        background-color: #cccccc;"
				+ "}"
				+ "    ul {"
				+ "        list-style-type: none;"
				+ "        margin: 0;"
				+ "        padding: 0;"
				+ "        overflow: hidden;"
				+ "        background-color:#0070C9;"
				+ "    }"
				+ "    li {"
				+ "        float: left;"
				+ "    }"
				+ "    li a {"
				+ "        display: block;"
				+ "        color: white;"
				+ "        text-align: center;"
				+ "        padding: 14px 16px;"
				+ "        text-decoration: none;"
				+ "    }"
				+ "/* Αλλαζω το χρωμα του link σε μαυρο κατα την προσπεραση του κερσωρα πανω απο αυτο */"
				+ "    li a:hover {"
				+ "        background-color: black;"
				+ "        border-bottom: 1px solid white;"
				+ "    }"
				+ ""
				+ ""
				+ "    *{"
				+ "        margin:0;"
				+ "        padding: 0;"
				+ "        box-sizing: border-box;"
				+ "    }"
				+ "    html{"
				+ "        height: 100%;"
				+ "    }"
				+ "    body{"
				+ "        font-family: 'Segoe UI', sans-serif;;"
				+ "        font-size: 1rem;"
				+ "        line-height: 1.6;"
				+ "        height: 100%;"
				+ "    }"
				+ "            *{"
				+ "      margin:0;"
				+ "      padding: 0;"
				+ "      box-sizing: border-box;"
				+ "    }"
				+ "    html{"
				+ "      height: 100%;"
				+ "    }"
				+ "    body{"
				+ "      font-family: 'Segoe UI', sans-serif;;"
				+ "      font-size: 1rem;"
				+ "      line-height: 1.6;"
				+ "      height: 100%;"
				+ "    }"
				+ "/*Μεγενθυνεται το κειμενο καθως περναω το ποντικι μου πανω απο αυτο */"
				+ "    .myheader2:hover, .myheader4:hover, .myheader3:hover {"
				+ "    transform: scale(1.5);"
				+ "  }"
				+ "</style>"
				+ "</head>"
				+ "<body>"
				+ " <center>"
				+ "                      <ul>"
				+ "                          <li><a href=\"index.html\">log out</a></li>"
				+ "                      </ul>"
				+ "</center>"
				+ "<h1>Welcome</h1> <center> <h2>" + name + " </h2> </center>"
				+ "<br>"
				+ "<form action=\"UserServlet\" method=\"POST\">"
				+ 	"<input type=\"submit\" name=\"infoButton\" value=\"See my information\">"
				+ "</form>"
				+ "<br>"
				+ "<br>"
				+ "<br>"
				+ "<form action=\"AppointmentServlet\" method=\"POST\">"
				+ 	"<input type=\"submit\" name=\"appoButton\" value=\"Appointments\">"
				+ "</form>"
				+ "</body>"
				+ "</html>"
				+ "");
		
//		 if ("See my information".equals(infobutton)) 
//		 {
//			 basicClasses.Patient.ViewScheduledAppointments();
//	     } 
//		 else if ("button2".equals(button)) 
//		 {
//			 PatientServlet.showMessage();
//	     }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
//	public void showMessage() {
//		JOptionPane.showMessageDialog(null, "Thank you for using Java", "Yay, java", JOptionPane.PLAIN_MESSAGE);
//	}

}
