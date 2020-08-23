package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.Votacao;

public class VotacaoDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(Votacao vv )
	{

		try

		{
             //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao(grupoa_1,grupoa_2, grupob_1,grupob_2, grupoc_1, grupoc_2 ,data_votacao, ip_votacao)values(?,?,?,?,?,?,?,?)");
			stm.setString(1,vv.getGrupoa_1());
			stm.setString(2,vv.getGrupoa_2()); 
			stm.setString(3,vv.getGrupob_1()); 
			stm.setString(4,vv.getGrupob_2()); 
			stm.setString(5,vv.getGrupoc_1()); 
			stm.setString(6,vv.getGrupoc_2()); 
			stm.setString(7,vv.getData_votacao()); 
			stm.setString(8,vv.getIp_votacao()); 
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
