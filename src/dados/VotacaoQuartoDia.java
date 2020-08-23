package dados;

import java.io.Serializable;

public class VotacaoQuartoDia  implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id_votacao_4;
	private String grupoa_1,grupoa_2, grupob_1,grupob_2, grupoc_1,grupoc_2 ,data_votacao_4_dia, ip_votacao_4_dia;
	
	//, grupod, grupoe, grupof, grupog, grupoh, grupoi,


	public VotacaoQuartoDia() {

	}

	public VotacaoQuartoDia(int id_votacao_4, String grupoa_1, String grupoa_2, String grupob_1, String grupob_2,
			String grupoc_1, String grupoc_2, String data_votacao_4_dia, String ip_votacao_4_dia) {
		super();
		this.id_votacao_4 = id_votacao_4;
		this.grupoa_1 = grupoa_1;
		this.grupoa_2 = grupoa_2;
		this.grupob_1 = grupob_1;
		this.grupob_2 = grupob_2;
		this.grupoc_1 = grupoc_1;
		this.grupoc_2 = grupoc_2;
		this.data_votacao_4_dia = data_votacao_4_dia;
		this.ip_votacao_4_dia = ip_votacao_4_dia;
	}

	public int getId_votacao_4() {
		return id_votacao_4;
	}

	public void setId_votacao_4(int id_votacao_4) {
		this.id_votacao_4 = id_votacao_4;
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

	public String getData_votacao_4_dia() {
		return data_votacao_4_dia;
	}

	public void setData_votacao_4_dia(String data_votacao_4_dia) {
		this.data_votacao_4_dia = data_votacao_4_dia;
	}

	public String getIp_votacao_4_dia() {
		return ip_votacao_4_dia;
	}

	public void setIp_votacao_4_dia(String ip_votacao_4_dia) {
		this.ip_votacao_4_dia = ip_votacao_4_dia;
	}
	
	




}