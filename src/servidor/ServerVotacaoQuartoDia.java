package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoQuartoDia;
import dao.VotacaoQuartoDiaDao;

/**
 * Servlet implementation class ServerVotacaoQuartoDia
 */
public class ServerVotacaoQuartoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoQuartoDia() {
        super();
        // TODO Auto-generated constructor stub
    }
    /**
   	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
   	 *      response)
   	 */
   	protected void doGet(HttpServletRequest request, HttpServletResponse response)
   			throws ServletException, IOException {
   		// TODO Auto-generated method stub
   		response.getWriter().append("Served at: ").append(request.getContextPath());
   		try {
   			doService(response, request);

   		} catch (ClassNotFoundException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (java.text.ParseException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (Exception e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   	}

   	/**
   	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
   	 *      response)
   	 */
   	protected void doPost(HttpServletRequest request, HttpServletResponse response)
   			throws ServletException, IOException {
   		// TODO Auto-generated method stub

   		try {
   			doService(response, request);
   		} catch (ClassNotFoundException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (java.text.ParseException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (SQLException e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		} catch (Exception e) {
   			// TODO Auto-generated catch block
   			e.printStackTrace();
   		}
   	}

   	private void doService(HttpServletResponse response, HttpServletRequest request) throws Exception {
   		// TODO Auto-generated method stub
   		response.setContentType("text/html");

   		String grupoa_1 = request.getParameter("grupoa_1");
   		String grupoa_2 = request.getParameter("grupoa_2");
   		String grupob_1 = request.getParameter("grupob_1");
   		String grupob_2 = request.getParameter("grupob_2");
   		String grupoc_1 = request.getParameter("grupoc_1");
  		String grupoc_2 = request.getParameter("grupoc_2");
   		String data_votacao_4_dia = request.getParameter("data_votacao_4_dia");
   		//System.out.println(data_votacao);
   		
   		
   		VotacaoQuartoDia v4 = new VotacaoQuartoDia();
   		VotacaoQuartoDiaDao vd4 = new VotacaoQuartoDiaDao();     
   		v4.setGrupoa_1(grupoa_1);
   		v4.setGrupoa_2(grupoa_2);
   		v4.setGrupob_1(grupob_1);
   		v4.setGrupob_2(grupob_2);
   		v4.setGrupoc_1(grupoc_1);
  		v4.setGrupoc_2(grupoc_2);
   		v4.setData_votacao_4_dia(data_votacao_4_dia);

   		vd4.open();
   		if(vd4 != null)
   		{
  			vd4.gravar(v4);
                
  			response.sendRedirect("sucessovotacaoequipesquartodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}