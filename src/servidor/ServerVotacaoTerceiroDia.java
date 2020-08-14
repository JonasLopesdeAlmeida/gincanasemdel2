package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoTerceiroDia;
import dao.VotacaoTerceiroDiaDao;

/**
 * Servlet implementation class ServerVotacaoTerceiroDia
 */
public class ServerVotacaoTerceiroDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoTerceiroDia() {
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

   		String grupog_1 = request.getParameter("grupog_1");
   		String grupog_2 = request.getParameter("grupog_2");
   		String grupoh_1 = request.getParameter("grupoh_1");
   		String grupoh_2 = request.getParameter("grupoh_2");
   		String grupoi_1 = request.getParameter("grupoi_1");
  		String grupoi_2 = request.getParameter("grupoi_2");
   		String data_votacao_3_dia = request.getParameter("data_votacao_3_dia");
   		//System.out.println(data_votacao);
   		
   		
   		VotacaoTerceiroDia v3 = new VotacaoTerceiroDia();
   		VotacaoTerceiroDiaDao vd3 = new VotacaoTerceiroDiaDao();     
   		v3.setGrupog_1(grupog_1);
   		v3.setGrupog_2(grupog_2);
   		v3.setGrupoh_1(grupoh_1);
   		v3.setGrupoh_2(grupoh_2);
   		v3.setGrupoi_1(grupoi_1);
  		v3.setGrupoi_2(grupoi_2);
   		v3.setData_votacao_3_dia(data_votacao_3_dia);

   		vd3.open();
   		if(vd3 != null)
   		{
  			vd3.gravar(v3);
                
  			response.sendRedirect("sucessovotacaoequipesterceirodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}