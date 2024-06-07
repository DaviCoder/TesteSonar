package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DvdModel;
import negocio.DvdRN;

/**
 * Servlet implementation class DvdCadastroSrv
 */

public class DvdCadastroSrv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DvdCadastroSrv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("nome");
		String autor = request.getParameter("autor");
		String genero = request.getParameter("genero");
		Integer anoLancamento = Integer.parseInt(request.getParameter("anoLancamento"));
		
		DvdModel dvdModel = new DvdModel(nome, autor,genero,anoLancamento);
		boolean retornoCadastro = false;
		
		DvdRN dvdRn = new DvdRN();
		
		try {
			retornoCadastro = dvdRn.cadastrar(dvdModel, request);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		
		if(retornoCadastro) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/Resposta.jsp");
			dispatcher.forward(request, response);
		}
		
	}

}
