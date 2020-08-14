package dados;

import java.io.Serializable;

public class Video implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private int id_video;
	private String masc_bacanga, fem_bacanga, masc_divineia, fem_divineia, data_votacao;
	
	
	public Video() {
		
		
	}
	
	public Video(int id_video, String masc_bacanga, String fem_bacanga, String masc_divineia, String fem_divineia, String data_votacao) {
		super();
		this.id_video = id_video;
		this.masc_bacanga = masc_bacanga;
		this.fem_bacanga = fem_bacanga;
		this.masc_divineia = masc_divineia;
		this.fem_divineia = fem_divineia;
		this.setData_votacao(data_votacao);
	}

	public int getId_video() {
		return id_video;
	}

	public void setId_video(int id_video) {
		this.id_video = id_video;
	}

	public String getMasc_bacanga() {
		return masc_bacanga;
	}

	public void setMasc_bacanga(String masc_bacanga) {
		this.masc_bacanga = masc_bacanga;
	}

	public String getFem_bacanga() {
		return fem_bacanga;
	}

	public void setFem_bacanga(String fem_bacanga) {
		this.fem_bacanga = fem_bacanga;
	}

	public String getMasc_divineia() {
		return masc_divineia;
	}

	public void setMasc_divineia(String masc_divineia) {
		this.masc_divineia = masc_divineia;
	}

	public String getFem_divineia() {
		return fem_divineia;
	}

	public void setFem_divineia(String fem_divineia) {
		this.fem_divineia = fem_divineia;
	}

	public String getData_votacao() {
		return data_votacao;
	}

	public void setData_votacao(String data_votacao) {
		this.data_votacao = data_votacao;
	}
	

	
	
	
	
}
