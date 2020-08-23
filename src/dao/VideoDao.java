package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.Video;

public class VideoDao extends Conecta{
	
	
	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(Video vd )
	{

		try

		{
           
			stm = con.prepareStatement("insert into video(masc_bacanga, fem_bacanga, masc_divineia, fem_divineia, data_votacao, ip_votacao_video)values(?,?,?,?,?,?)");
			stm.setString(1,vd.getMasc_bacanga());
			stm.setString(2,vd.getFem_bacanga()); 
			stm.setString(3,vd.getMasc_divineia()); 
			stm.setString(4,vd.getFem_divineia()); 
			stm.setString(5,vd.getData_votacao()); 
			stm.setString(6, vd.getIp_votacao_video());
			stm.execute();
			stm.close();                             
			con.close();
		}
		catch(SQLException erroSQL) /* erro no banco de dados */
		{
			System.out.println("Erro de conexão com o banco de dados , erro"+erroSQL);
		} 

	}
	

}
