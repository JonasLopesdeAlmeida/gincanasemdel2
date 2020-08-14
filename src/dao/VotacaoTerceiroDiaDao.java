package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoTerceiroDia;

public class VotacaoTerceiroDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoTerceiroDia v3 )
	{

		try

		{
             //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao_3_dia(grupog_1,grupog_2, grupoh_1,grupoh_2, grupoi_1,grupoi_2 ,data_votacao_3_dia )values(?,?,?,?,?,?,?)");
			stm.setString(1,v3.getGrupog_1());
			stm.setString(2,v3.getGrupog_2()); 
			stm.setString(3,v3.getGrupoh_1()); 
			stm.setString(4,v3.getGrupoh_2()); 
			stm.setString(5,v3.getGrupoi_1()); 
			stm.setString(6,v3.getGrupoi_2()); 
			stm.setString(7,v3.getData_votacao_3_dia()); 
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
