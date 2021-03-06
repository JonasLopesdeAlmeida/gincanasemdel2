package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoDecimoDia;

public class VotacaoDecimoDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoDecimoDia v10 )
	{

		try

		{
	         //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao_10_dia(grupoa_1,grupoa_2, grupob_1,grupob_2,data_votacao_10_dia, ip_votacao_10_dia)values(?,?,?,?,?,?)");
			stm.setString(1,v10.getGrupoa_1());
			stm.setString(2,v10.getGrupoa_2()); 
			stm.setString(3,v10.getGrupob_1()); 
			stm.setString(4,v10.getGrupob_2()); 
			stm.setString(5,v10.getData_votacao_10_dia()); 
			stm.setString(6, v10.getIp_votacao_10_dia());
			stm.execute();
			stm.close();                             
			con.close();
		}
		catch(SQLException erroSQL) /* erro no banco de dados */
		{
			System.out.println("Erro de conex�o com o banco de dados , erro"+erroSQL);
		} 

	}

	}
