package model;

public class DvdModel {
	private String autor;
	private String nome;
	private Integer anoLancamento;
	private String genero;


	public DvdModel(String nome, String autor, String genero, Integer anoLancamento){
		this.nome = nome;
		this.autor = autor;
		this.genero = genero;
		this.anoLancamento = anoLancamento; 
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getAnoLancamento() {
		return anoLancamento;
	}


	public void setAnoLancamento(Integer anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
	
	
}
