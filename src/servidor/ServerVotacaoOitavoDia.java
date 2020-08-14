package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoOitavoDia;
import dao.VotacaoOitavoDiaDao;

/**
 * Servlet implementation class ServerVotacaoOitavoDia
 */
public class ServerVotacaoOitavoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoOitavoDia() {
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

   		String grupod_1 = request.getParameter("grupod_1");
   		String grupod_2 = request.getParameter("grupod_2");
   		String grupoe_1 = request.getParameter("grupoe_1");
   		String grupoe_2 = request.getParameter("grupoe_2");
   		String grupof_1 = request.getParameter("grupof_1");
  		String grupof_2 = request.getParameter("grupof_2");
   		String data_votacao_8_dia = request.getParameter("data_votacao_8_dia");
   		//System.out.println(data_votacao);
   		
   		
   		VotacaoOitavoDia v8 = new VotacaoOitavoDia();
   		VotacaoOitavoDiaDao vd8 = new VotacaoOitavoDiaDao();     
   		v8.setGrupod_1(grupod_1);
   		v8.setGrupod_2(grupod_2);
   		v8.setGrupoe_1(grupoe_1);
   		v8.setGrupoe_2(grupoe_2);
   		v8.setGrupof_1(grupof_1);
  		v8.setGrupof_2(grupof_2);
   		v8.setData_votacao_8_dia(data_votacao_8_dia);

   		vd8.open();
   		if(vd8 != null)
   		{
  			vd8.gravar(v8);
                
  			response.sendRedirect("sucessovotacaoequipesoitavodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}