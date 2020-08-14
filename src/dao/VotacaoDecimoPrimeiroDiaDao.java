package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoDecimoPrimeiroDia;

public class VotacaoDecimoPrimeiroDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoDecimoPrimeiroDia v11 )
	{

		try

		{
	         //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao_11_dia(grupoa_1,grupoa_2, grupob_1,grupob_2,data_votacao_11_dia)values(?,?,?,?,?)");
			stm.setString(1,v11.getGrupoa_1());
			stm.setString(2,v11.getGrupoa_2()); 
			stm.setString(3,v11.getGrupob_1()); 
			stm.setString(4,v11.getGrupob_2()); 
			stm.setString(5,v11.getData_votacao_11_dia()); 
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
