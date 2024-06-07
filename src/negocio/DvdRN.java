package negocio;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import model.DvdModel;

public class DvdRN {
	
	
	public DvdRN() {
		
	}
	
	
	
	public boolean cadastrar(DvdModel model, HttpServletRequest request) throws Exception{
		HttpSession sessao = request.getSession();
		sessao.setAttribute("nomeDvd", model.getNome());
	
		request.setAttribute("novoAtributoCriadoRn", model.getAnoLancamento()+" - -"+model.getGenero());
		
		return true;
	}
	

}
