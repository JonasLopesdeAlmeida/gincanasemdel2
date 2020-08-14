package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoQuartoDia;

public class VotacaoQuartoDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoQuartoDia v4 )
	{

		try

		{
             //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao_4_dia(grupoa_1,grupoa_2, grupob_1,grupob_2, grupoc_1,grupoc_2 ,data_votacao_4_dia)values(?,?,?,?,?,?,?)");
			stm.setString(1,v4.getGrupoa_1());
			stm.setString(2,v4.getGrupoa_2()); 
			stm.setString(3,v4.getGrupob_1()); 
			stm.setString(4,v4.getGrupob_2()); 
			stm.setString(5,v4.getGrupoc_1()); 
			stm.setString(6,v4.getGrupoc_2()); 
			stm.setString(7,v4.getData_votacao_4_dia()); 
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
