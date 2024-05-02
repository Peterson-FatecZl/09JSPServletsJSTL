package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ImpostoPortoAlegre;

import java.io.IOException;

@WebServlet("/calculoPortoAlegre")
public class TaxaDeImpostoPortoAlegreServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaxaDeImpostoPortoAlegreServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String AreaTotal = request.getParameter("areaTotal");
		String AreaGaragem = request.getParameter("areaGaragem");
		
		ImpostoPortoAlegre taxa = new ImpostoPortoAlegre(Double.parseDouble(AreaTotal), Double.parseDouble(AreaGaragem));
		double imposto = taxa.calcularImposto();
		request.setAttribute("imposto", imposto);
		
		RequestDispatcher rd = request.getRequestDispatcher("PortoAlegre.jsp");
		rd.forward(request, response);
	}

}
