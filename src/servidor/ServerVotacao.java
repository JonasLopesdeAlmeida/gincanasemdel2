package servidor;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.Votacao;
import dao.VotacaoDao;

/**
 * Servlet implementation class ServerVotacao
 */
public class ServerVotacao extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacao() {
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
        
   		String ip_votacao = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip_votacao);
   		String grupoa_1 = request.getParameter("grupoa_1");
   		String grupoa_2 = request.getParameter("grupoa_2");
   		String grupob_1 = request.getParameter("grupob_1");
   		String grupob_2 = request.getParameter("grupob_2");
   		String grupoc_1 = request.getParameter("grupoc_1");
  		String grupoc_2 = request.getParameter("grupoc_2");
   		String data_votacao = request.getParameter("data_votacao");
   		//System.out.println(data_votacao);
   		
   		
   		Votacao vv = new Votacao();
   		VotacaoDao vd = new VotacaoDao();     
   		vv.setGrupoa_1(grupoa_1);
   		vv.setGrupoa_2(grupoa_2);
   		vv.setGrupob_1(grupob_1);
   		vv.setGrupob_2(grupob_2);
   		vv.setGrupoc_1(grupoc_1);
  		vv.setGrupoc_2(grupoc_2);
   		vv.setData_votacao(data_votacao);
   		vv.setIp_votacao(ip_votacao);

   		vd.open();
   		if(vd != null)
   		{
  			vd.gravar(vv);
                
  			response.sendRedirect("sucessovotacaoequipes.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}