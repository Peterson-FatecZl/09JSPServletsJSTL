package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ImpostoBeloHorizonte;

import java.io.IOException;

@WebServlet("/calculoBeloHorizonte")
public class TaxaDeImpostoBeloHorizonteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaxaDeImpostoBeloHorizonteServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String areaTotal = request.getParameter("areaTotal");
		String numQuartos = request.getParameter("numQuartos");
		
		ImpostoBeloHorizonte Taxa = new ImpostoBeloHorizonte(Double.parseDouble(areaTotal), Integer.parseInt(numQuartos));
		double imposto = Taxa.calcularImposto();
		request.setAttribute("imposto", imposto);
		
		RequestDispatcher rd = request.getRequestDispatcher("BeloHorizonte.jsp");
		rd.forward(request, response);
	}

}
