package servidor;

import java.io.IOException;
import java.net.InetAddress;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dados.Video;
import dao.VideoDao;

/**
 * Servlet implementation class ServerVideo
 */
public class ServerVideo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServerVideo() {
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
        
   		//masc_bacanga, fem_bacanga, masc_divineia, fem_divineia, data_votacao
   		String masc_bacanga = request.getParameter("masc_bacanga");
   		String fem_bacanga = request.getParameter("fem_bacanga");
   		String masc_divineia = request.getParameter("masc_divineia");
   		String fem_divineia = request.getParameter("fem_divineia");
   		String data_votacao = request.getParameter("data_votacao");
   		
   		String ip_votacao_video = request.getHeader("x-forwarded-for");
   		//pegando ip reverso mesmo se estiver por tras de proxy.
   		if (ip_votacao_video == null) {
   			ip_votacao_video = request.getHeader("X_FORWARDED_FOR");
   		    if (ip_votacao_video == null){
   		    	ip_votacao_video = request.getRemoteAddr();
   		    }
   		}
   		
        System.out.println(ip_votacao_video);
   		
   		
   		
   		
   		Video vi = new Video();
   		VideoDao vd = new VideoDao();     
   		vi.setMasc_bacanga(masc_bacanga);
   		vi.setFem_bacanga(fem_bacanga);
   		vi.setMasc_divineia(masc_divineia);
   		vi.setFem_divineia(fem_divineia);
   		vi.setData_votacao(data_votacao);
   		vi.setIp_votacao_video(ip_votacao_video);

   		vd.open();
   		if(vd != null)
   		{
  			vd.gravar(vi);
                
  			response.sendRedirect("sucessovotacaoembaixadinhaprimeirodia.jsp");
  			//response.sendRedirect("sucessoescola.jsp?instituicao=" + instituicao);
   		}
   		 
   	}
}
