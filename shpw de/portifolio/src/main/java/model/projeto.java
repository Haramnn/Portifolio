package model;

public class projeto {

	private int id;
	private String titulo;
	private String descrição;
	private String link;
	private String tecnologias;
	private String data_criação;
	
	
	public projeto() {}


	public projeto(int id, String titulo, String descrição, String link, String tecnologias, String data_criação) {
		this.id = id;
		this.titulo = titulo;
		this.descrição = descrição;
		this.link = link;
		this.tecnologias = tecnologias;
		this.data_criação = data_criação;
	}


	public projeto(String titulo, String descrição, String link, String tecnologias, String data_criação) {
		super();
		this.titulo = titulo;
		this.descrição = descrição;
		this.link = link;
		this.tecnologias = tecnologias;
		this.data_criação = data_criação;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getDescrição() {
		return descrição;
	}


	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}


	public String getLink() {
		return link;
	}


	public void setLink(String link) {
		this.link = link;
	}


	public String getTecnologias() {
		return tecnologias;
	}


	public void setTecnologias(String tecnologias) {
		this.tecnologias = tecnologias;
	}


	public String getData_criação() {
		return data_criação;
	}


	public void setData_criação(String data_criação) {
		this.data_criação = data_criação;
	}
	
	

	
	
}
