package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoSetimoDia;

public class VotacaoSetimoDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoSetimoDia v7 )
	{

		try

		{
             //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao_7_dia(grupoa_1,grupoa_2, grupob_1,grupob_2, grupoc_1,grupoc_2 ,data_votacao_7_dia)values(?,?,?,?,?,?,?)");
			stm.setString(1,v7.getGrupoa_1());
			stm.setString(2,v7.getGrupoa_2()); 
			stm.setString(3,v7.getGrupob_1()); 
			stm.setString(4,v7.getGrupob_2()); 
			stm.setString(5,v7.getGrupoc_1()); 
			stm.setString(6,v7.getGrupoc_2()); 
			stm.setString(7,v7.getData_votacao_7_dia()); 
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
