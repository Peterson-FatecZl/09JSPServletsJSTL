package controller;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.ImpostoSaoPaulo;

@WebServlet("/calculoSaoPaulo")
public class TaxaImpostoSaoPauloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public TaxaImpostoSaoPauloServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String areaTotal =  request.getParameter("areaTotal");
		String numeroDeComodos = request.getParameter("numComodos");
		
		ImpostoSaoPaulo Taxa = new ImpostoSaoPaulo(Double.parseDouble(areaTotal), Integer.parseInt(numeroDeComodos));
		double imposto = Taxa.calcularImposto();
		request.setAttribute("imposto", imposto);
		
		RequestDispatcher rd = request.getRequestDispatcher("SaoPaulo.jsp");
		rd.forward(request, response);
		
	}


}
