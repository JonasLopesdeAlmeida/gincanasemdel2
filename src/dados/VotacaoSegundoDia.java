package dados;

import java.io.Serializable;

public class VotacaoSegundoDia  implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id_votacao_2;
	private String grupod_1,grupod_2, grupoe_1,grupoe_2, grupof_1,grupof_2 ,data_votacao_2_dia;
	
	//, grupod, grupoe, grupof, grupog, grupoh, grupoi,


	public VotacaoSegundoDia() {

	}

	public VotacaoSegundoDia(int id_votacao_2, String grupod_1, String grupod_2, String grupoe_1, String grupoe_2, String grupof_1,
			String grupof_2, String data_votacao_2_dia) {
		super();
		this.id_votacao_2 = id_votacao_2;
		this.grupod_1 = grupod_1;
		this.grupod_2 = grupod_2;
		this.grupoe_1 = grupoe_1;
		this.grupoe_2 = grupoe_2;
		this.grupof_1 = grupof_1;
		this.grupof_2 = grupof_2;
		this.data_votacao_2_dia = data_votacao_2_dia;
	}

	public int getId_votacao_2() {
		return id_votacao_2;
	}

	public void setId_votacao_2(int id_votacao_2) {
		this.id_votacao_2 = id_votacao_2;
	}

	public String getGrupod_1() {
		return grupod_1;
	}

	public void setGrupod_1(String grupod_1) {
		this.grupod_1 = grupod_1;
	}

	public String getGrupod_2() {
		return grupod_2;
	}

	public void setGrupod_2(String grupod_2) {
		this.grupod_2 = grupod_2;
	}

	public String getGrupoe_1() {
		return grupoe_1;
	}

	public void setGrupoe_1(String grupoe_1) {
		this.grupoe_1 = grupoe_1;
	}

	public String getGrupoe_2() {
		return grupoe_2;
	}

	public void setGrupoe_2(String grupoe_2) {
		this.grupoe_2 = grupoe_2;
	}

	public String getGrupof_1() {
		return grupof_1;
	}

	public void setGrupof_1(String grupof_1) {
		this.grupof_1 = grupof_1;
	}

	public String getGrupof_2() {
		return grupof_2;
	}

	public void setGrupof_2(String grupof_2) {
		this.grupof_2 = grupof_2;
	}

	public String getData_votacao_2_dia() {
		return data_votacao_2_dia;
	}

	public void setData_votacao_2_dia(String data_votacao_2_dia) {
		this.data_votacao_2_dia = data_votacao_2_dia;
	}

	
	


}