package dados;

import java.io.Serializable;

public class Votacao implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id_votacao;
	private String grupoa_1, grupoa_2, grupob_1,grupob_2, grupoc_1,grupoc_2 ,data_votacao, ip_votacao;
	
	//, grupod, grupoe, grupof, grupog, grupoh, grupoi,


	public Votacao() {

	}

	public Votacao(int id_votacao, String grupoa_1, String grupoa_2, String grupob_1, String grupob_2, String grupoc_1,
			String grupoc_2, String data_votacao, String ip_votacao) {
		super();
		this.id_votacao = id_votacao;
		this.grupoa_1 = grupoa_1;
		this.grupoa_2 = grupoa_2;
		this.grupob_1 = grupob_1;
		this.grupob_2 = grupob_2;
		this.grupoc_1 = grupoc_1;
		this.grupoc_2 = grupoc_2;
		this.data_votacao = data_votacao;
		this.ip_votacao = ip_votacao;
	}

	public int getId_votacao() {
		return id_votacao;
	}

	public void setId_votacao(int id_votacao) {
		this.id_votacao = id_votacao;
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

	public String getIp_votacao() {
		return ip_votacao;
	}

	public void setIp_votacao(String ip_votacao) {
		this.ip_votacao = ip_votacao;
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

	public String getData_votacao() {
		return data_votacao;
	}

	public void setData_votacao(String data_votacao) {
		this.data_votacao = data_votacao;
	}


	
	


}
