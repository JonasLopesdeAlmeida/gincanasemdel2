package servidor;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoSegundoDia;
import dao.VotacaoSegundoDiaDao;

/**
 * Servlet implementation class ServerVotacaoSegundoDia
 */
public class ServerVotacaoSegundoDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoSegundoDia() {
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
   		String data_votacao_2_dia = request.getParameter("data_votacao_2_dia");
   		
   		String ip_votacao_2_dia = request.getHeader("x-forwarded-for");
   		if (ip_votacao_2_dia == null) {
   			ip_votacao_2_dia = request.getHeader("X_FORWARDED_FOR");
   		    if (ip_votacao_2_dia == null){
   		    	ip_votacao_2_dia = request.getRemoteAddr();
   		    }
   		}
   		
        System.out.println(ip_votacao_2_dia);

   		
   		
   		VotacaoSegundoDia v2 = new VotacaoSegundoDia();
   		VotacaoSegundoDiaDao vd2 = new VotacaoSegundoDiaDao();     
   		v2.setGrupod_1(grupod_1);
   		v2.setGrupod_2(grupod_2);
   		v2.setGrupoe_1(grupoe_1);
   		v2.setGrupoe_2(grupoe_2);
   		v2.setGrupof_1(grupof_1);
  		v2.setGrupof_2(grupof_2);
   		v2.setData_votacao_2_dia(data_votacao_2_dia);
   		v2.setIp_votacao_2_dia(ip_votacao_2_dia);

   		vd2.open();
   		if(vd2 != null)
   		{
  			vd2.gravar(v2);
                
  			response.sendRedirect("sucessovotacaoequipessegundodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}