package servidor;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.VotacaoDecimoPrimeiroDia;
import dao.VotacaoDecimoPrimeiroDiaDao;

/**
 * Servlet implementation class ServidorVotacaoDecimoPrimeiroDia
 */
public class ServerVotacaoDecimoPrimeiroDia extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVotacaoDecimoPrimeiroDia() {
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
   		String data_votacao_11_dia = request.getParameter("data_votacao_11_dia");
   		String ip_votacao_11_dia = InetAddress.getLocalHost().getHostAddress();
        System.out.println(ip_votacao_11_dia);
   		
   		
   		VotacaoDecimoPrimeiroDia v11 = new VotacaoDecimoPrimeiroDia();
   		VotacaoDecimoPrimeiroDiaDao vd11 = new VotacaoDecimoPrimeiroDiaDao();     
   		v11.setGrupoa_1(grupoa_1);
   		v11.setGrupoa_2(grupoa_2);
   		v11.setGrupob_1(grupob_1);
   		v11.setGrupob_2(grupob_2);
   		v11.setData_votacao_11_dia(data_votacao_11_dia);
   		v11.setIp_votacao_11_dia(ip_votacao_11_dia);

   		vd11.open();
   		if(vd11 != null)
   		{
  			vd11.gravar(v11);
                
  			response.sendRedirect("sucessovotacaoequipesdecimoprimeirodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}