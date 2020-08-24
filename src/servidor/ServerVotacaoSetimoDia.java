package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoSetimoDia;
import dao.VotacaoSetimoDiaDao;

/**
 * Servlet implementation class ServerVotacaoSetimoDia
 */
public class ServerVotacaoSetimoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoSetimoDia() {
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
   		String data_votacao_7_dia = request.getParameter("data_votacao_7_dia");
   		
   		String ip_votacao_7_dia = request.getHeader("x-forwarded-for");
   		if (ip_votacao_7_dia == null) {
   			ip_votacao_7_dia = request.getHeader("X_FORWARDED_FOR");
   		    if (ip_votacao_7_dia == null){
   		    	ip_votacao_7_dia = request.getRemoteAddr();
   		    }
   		}
   		
        System.out.println(ip_votacao_7_dia);
   		
   		
   		
   		VotacaoSetimoDia v7 = new VotacaoSetimoDia();
   		VotacaoSetimoDiaDao vd7 = new VotacaoSetimoDiaDao();     
   		v7.setGrupoa_1(grupoa_1);
   		v7.setGrupoa_2(grupoa_2);
   		v7.setGrupob_1(grupob_1);
   		v7.setGrupob_2(grupob_2);
   		v7.setGrupoc_1(grupoc_1);
  		v7.setGrupoc_2(grupoc_2);
   		v7.setData_votacao_7_dia(data_votacao_7_dia);
   		v7.setIp_votacao_7_dia(ip_votacao_7_dia);

   		vd7.open();
   		if(vd7 != null)
   		{
  			vd7.gravar(v7);
                
  			response.sendRedirect("sucessovotacaoequipessetimodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}