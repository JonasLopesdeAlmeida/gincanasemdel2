package dados;

import java.io.Serializable;

public class VotacaoDecimoDia  implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id_votacao_10;
	private String grupoa_1,grupoa_2, grupob_1,grupob_2, data_votacao_10_dia;
	
	//, grupod, grupoe, grupof, grupog, grupoh, grupoi,


	public VotacaoDecimoDia() {

	}

	public VotacaoDecimoDia(int id_votacao_10, String grupoa_1, String grupoa_2, String grupob_1, String grupob_2, String data_votacao_10_dia) {
		super();
		this.id_votacao_10 = id_votacao_10;
		this.grupoa_1 = grupoa_1;
		this.grupoa_2 = grupoa_2;
		this.grupob_1 = grupob_1;
		this.grupob_2 = grupob_2;
		this.data_votacao_10_dia = data_votacao_10_dia;
	}

	public int getId_votacao_10() {
		return id_votacao_10;
	}

	public void setId_votacao_10(int id_votacao_10) {
		this.id_votacao_10 = id_votacao_10;
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

	public String getData_votacao_10_dia() {
		return data_votacao_10_dia;
	}

	public void setData_votacao_10_dia(String data_votacao_10_dia) {
		this.data_votacao_10_dia = data_votacao_10_dia;
	}




}