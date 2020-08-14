package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoNonoDia;

public class VotacaoNonoDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoNonoDia v9 )
	{

		try

		{
            
			stm = con.prepareStatement("insert into votacao_9_dia(grupog_1,grupog_2, grupoh_1, grupoh_2, grupoi_1, grupoi_2 , data_votacao_9_dia )values(?,?,?,?,?,?,?)");
			stm.setString(1,v9.getGrupog_1());
			stm.setString(2,v9.getGrupog_2()); 
			stm.setString(3,v9.getGrupoh_1()); 
			stm.setString(4,v9.getGrupoh_2()); 
			stm.setString(5,v9.getGrupoi_1()); 
			stm.setString(6,v9.getGrupoi_2()); 
			stm.setString(7,v9.getData_votacao_9_dia()); 
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
