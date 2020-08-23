package dados;

import java.io.Serializable;

public class VotacaoSetimoDia  implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id_votacao_7;
	private String grupoa_1,grupoa_2, grupob_1,grupob_2, grupoc_1,grupoc_2 ,data_votacao_7_dia, ip_votacao_7_dia;
	
	//, grupod, grupoe, grupof, grupog, grupoh, grupoi,


	public VotacaoSetimoDia() {

	}

	public VotacaoSetimoDia(int id_votacao_7, String grupoa_1, String grupoa_2, String grupob_1, String grupob_2,
			String grupoc_1, String grupoc_2, String data_votacao_7_dia, String ip_votacao_7_dia) {
		super();
		this.id_votacao_7 = id_votacao_7;
		this.grupoa_1 = grupoa_1;
		this.grupoa_2 = grupoa_2;
		this.grupob_1 = grupob_1;
		this.grupob_2 = grupob_2;
		this.grupoc_1 = grupoc_1;
		this.grupoc_2 = grupoc_2;
		this.data_votacao_7_dia = data_votacao_7_dia;
		this.ip_votacao_7_dia = ip_votacao_7_dia;
	}

	public int getId_votacao_7() {
		return id_votacao_7;
	}

	public void setId_votacao_7(int id_votacao_7) {
		this.id_votacao_7 = id_votacao_7;
	}

	public String getGrupoa_1() {
		return grupoa_1;
	}

	public void setGrupoa_1(String grupoa_1) {
		this.grupoa_1 = grupoa_1;
	}

	public String getGrupoa_2() {
		return grupoa_2;
	}

	public void setGrupoa_2(String grupoa_2) {
		this.grupoa_2 = grupoa_2;
	}

	public String getGrupob_1() {
		return grupob_1;
	}

	public void setGrupob_1(String grupob_1) {
		this.grupob_1 = grupob_1;
	}

	public String getGrupob_2() {
		return grupob_2;
	}

	public void setGrupob_2(String grupob_2) {
		this.grupob_2 = grupob_2;
	}

	public String getGrupoc_1() {
		return grupoc_1;
	}

	public void setGrupoc_1(String grupoc_1) {
		this.grupoc_1 = grupoc_1;
	}

	public String getGrupoc_2() {
		return grupoc_2;
	}

	public void setGrupoc_2(String grupoc_2) {
		this.grupoc_2 = grupoc_2;
	}

	public String getData_votacao_7_dia() {
		return data_votacao_7_dia;
	}

	public void setData_votacao_7_dia(String data_votacao_7_dia) {
		this.data_votacao_7_dia = data_votacao_7_dia;
	}

	public String getIp_votacao_7_dia() {
		return ip_votacao_7_dia;
	}

	public void setIp_votacao_7_dia(String ip_votacao_7_dia) {
		this.ip_votacao_7_dia = ip_votacao_7_dia;
	}

	



}