package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ImpostoCuritiba;

@WebServlet("/calculoCuritiba")
public class TaxaDeImpostoCuritibaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaxaDeImpostoCuritibaServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String areaTotal = request.getParameter("areaTotal");
		String idadeImovel = request.getParameter("idadeImovel");
		
		ImpostoCuritiba Taxa = new ImpostoCuritiba(Double.parseDouble(areaTotal), Integer.parseInt(idadeImovel));
		double imposto = Taxa.calcularImposto();
		request.setAttribute("imposto", imposto);
		
		RequestDispatcher rd = request.getRequestDispatcher("Curitiba.jsp");
		rd.forward(request, response);
	}

}
