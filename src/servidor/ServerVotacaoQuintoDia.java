package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoQuintoDia;
import dao.VotacaoQuintoDiaDao;

/**
 * Servlet implementation class ServerVotacaoQuintoDia
 */
public class ServerVotacaoQuintoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoQuintoDia() {
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
   		String data_votacao_5_dia = request.getParameter("data_votacao_5_dia");
   		//System.out.println(data_votacao);
   		
   		
   		VotacaoQuintoDia v5 = new VotacaoQuintoDia();
   		VotacaoQuintoDiaDao vd5 = new VotacaoQuintoDiaDao();     
   		v5.setGrupod_1(grupod_1);
   		v5.setGrupod_2(grupod_2);
   		v5.setGrupoe_1(grupoe_1);
   		v5.setGrupoe_2(grupoe_2);
   		v5.setGrupof_1(grupof_1);
  		v5.setGrupof_2(grupof_2);
   		v5.setData_votacao_5_dia(data_votacao_5_dia);

   		vd5.open();
   		if(vd5 != null)
   		{
  			vd5.gravar(v5);
                
  			response.sendRedirect("sucessovotacaoequipesquintodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}