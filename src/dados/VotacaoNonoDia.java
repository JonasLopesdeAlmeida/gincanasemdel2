package dados;

import java.io.Serializable;

public class VotacaoNonoDia  implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id_votacao_9;
	private String grupog_1,grupog_2, grupoh_1,grupoh_2, grupoi_1,grupoi_2 ,data_votacao_9_dia, ip_votacao_9_dia;
	


	public VotacaoNonoDia() {

	}

	public VotacaoNonoDia(int id_votacao_9, String grupog_1, String grupog_2, String grupoh_1, String grupoh_2,
			String grupoi_1, String grupoi_2, String data_votacao_9_dia, String ip_votacao_9_dia) {
		super();
		this.id_votacao_9 = id_votacao_9;
		this.grupog_1 = grupog_1;
		this.grupog_2 = grupog_2;
		this.grupoh_1 = grupoh_1;
		this.grupoh_2 = grupoh_2;
		this.grupoi_1 = grupoi_1;
		this.grupoi_2 = grupoi_2;
		this.data_votacao_9_dia = data_votacao_9_dia;
		this.ip_votacao_9_dia = ip_votacao_9_dia;
	}

	public int getId_votacao_9() {
		return id_votacao_9;
	}

	public void setId_votacao_9(int id_votacao_9) {
		this.id_votacao_9 = id_votacao_9;
	}

	public String getGrupog_1() {
		return grupog_1;
	}

	public void setGrupog_1(String grupog_1) {
		this.grupog_1 = grupog_1;
	}

	public String getGrupog_2() {
		return grupog_2;
	}

	public void setGrupog_2(String grupog_2) {
		this.grupog_2 = grupog_2;
	}

	public String getGrupoh_1() {
		return grupoh_1;
	}

	public void setGrupoh_1(String grupoh_1) {
		this.grupoh_1 = grupoh_1;
	}

	public String getGrupoh_2() {
		return grupoh_2;
	}

	public void setGrupoh_2(String grupoh_2) {
		this.grupoh_2 = grupoh_2;
	}

	public String getGrupoi_1() {
		return grupoi_1;
	}

	public void setGrupoi_1(String grupoi_1) {
		this.grupoi_1 = grupoi_1;
	}

	public String getGrupoi_2() {
		return grupoi_2;
	}

	public void setGrupoi_2(String grupoi_2) {
		this.grupoi_2 = grupoi_2;
	}

	public String getData_votacao_9_dia() {
		return data_votacao_9_dia;
	}

	public void setData_votacao_9_dia(String data_votacao_9_dia) {
		this.data_votacao_9_dia = data_votacao_9_dia;
	}

	public String getIp_votacao_9_dia() {
		return ip_votacao_9_dia;
	}

	public void setIp_votacao_9_dia(String ip_votacao_9_dia) {
		this.ip_votacao_9_dia = ip_votacao_9_dia;
	}
	
	
    



}