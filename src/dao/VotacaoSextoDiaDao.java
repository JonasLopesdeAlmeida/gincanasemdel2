package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoSextoDia;

public class VotacaoSextoDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoSextoDia v6 )
	{

		try

		{
            
			stm = con.prepareStatement("insert into votacao_6_dia(grupog_1,grupog_2, grupoh_1, grupoh_2, grupoi_1, grupoi_2 , data_votacao_6_dia )values(?,?,?,?,?,?,?)");
			stm.setString(1,v6.getGrupog_1());
			stm.setString(2,v6.getGrupog_2()); 
			stm.setString(3,v6.getGrupoh_1()); 
			stm.setString(4,v6.getGrupoh_2()); 
			stm.setString(5,v6.getGrupoi_1()); 
			stm.setString(6,v6.getGrupoi_2()); 
			stm.setString(7,v6.getData_votacao_6_dia()); 
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
