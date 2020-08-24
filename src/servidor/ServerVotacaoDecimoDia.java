package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoDecimoDia;
import dao.VotacaoDecimoDiaDao;

/**
 * Servlet implementation class ServerVotacaoDecimoDia
 */
public class ServerVotacaoDecimoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoDecimoDia() {
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
   		String data_votacao_10_dia = request.getParameter("data_votacao_10_dia");
   		
   		String ip_votacao_10_dia = request.getHeader("x-forwarded-for");
   		//pegando ip reverso mesmo se estiver por tras de proxy.
   		if (ip_votacao_10_dia == null) {
   			ip_votacao_10_dia = request.getHeader("X_FORWARDED_FOR");
   		    if (ip_votacao_10_dia == null){
   		    	ip_votacao_10_dia = request.getRemoteAddr();
   		    }
   		}
   		
        System.out.println(ip_votacao_10_dia);
   		
   		
   		VotacaoDecimoDia v10 = new VotacaoDecimoDia();
   		VotacaoDecimoDiaDao vd10 = new VotacaoDecimoDiaDao();     
   		v10.setGrupoa_1(grupoa_1);
   		v10.setGrupoa_2(grupoa_2);
   		v10.setGrupob_1(grupob_1);
   		v10.setGrupob_2(grupob_2);
   		v10.setData_votacao_10_dia(data_votacao_10_dia);
   		v10.setIp_votacao_10_dia(ip_votacao_10_dia);

   		vd10.open();
   		if(vd10 != null)
   		{
  			vd10.gravar(v10);
                
  			response.sendRedirect("sucessovotacaoequipesdecimodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}