package model;

public class postagem {
	
	private int id;
	private String titulo;
	private String img;
	private String conteudo;
	private int autorId;
	private String autorNome;
	private String data_publicacao;
	private String status;
	
	
	public postagem() {}


	public postagem(String titulo, String img, String conteudo, int autorId) {
		this.titulo = titulo;
		this.img = img;
		this.conteudo = conteudo;
		this.autorId = autorId;
	}


	public postagem(int id, String titulo, String img, String conteudo, int autorId) {
		this.id = id;
		this.titulo = titulo;
		this.img = img;
		this.conteudo = conteudo;
		this.autorId = autorId;
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


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public String getConteudo() {
		return conteudo;
	}


	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}


	public int getAutorId() {
		return autorId;
	}


	public void setAutorId(int autorId) {
		this.autorId = autorId;
	}


	public String getAutorNome() {
		return autorNome;
	}


	public void setAutorNome(String autorNome) {
		this.autorNome = autorNome;
	}


	public String getData_publicacao() {
		return data_publicacao;
	}


	public void setData_publicacao(String data_publicacao) {
		this.data_publicacao = data_publicacao;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}
	
	
		
			
			
			
			

}
