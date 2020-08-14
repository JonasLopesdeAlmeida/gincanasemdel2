package dao;

import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import conexao.Conecta;
import dados.VotacaoSegundoDia;

public class VotacaoSegundoDiaDao extends Conecta  {

	PreparedStatement stm = null;
	PrintWriter out =  null;
	ResultSet rs = null;


	public void gravar(VotacaoSegundoDia v2 )
	{

		try

		{
             //grupod,grupoe,grupof,grupog,grupoh,grupoi,
			stm = con.prepareStatement("insert into votacao_2_dia(grupod_1,grupod_2, grupoe_1,grupoe_2, grupof_1,grupof_2 ,data_votacao_2_dia )values(?,?,?,?,?,?,?)");
			stm.setString(1,v2.getGrupod_1());
			stm.setString(2,v2.getGrupod_2()); 
			stm.setString(3,v2.getGrupoe_1()); 
			stm.setString(4,v2.getGrupoe_2()); 
			stm.setString(5,v2.getGrupof_1()); 
			stm.setString(6,v2.getGrupof_2()); 
			stm.setString(7,v2.getData_votacao_2_dia()); 
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
