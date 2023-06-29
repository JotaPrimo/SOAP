package com.jotasantos.crudservice.modelo;

import java.util.Date;

public class Noticia {
	private Long id;
	private String titulo;
	private String texto;
	private Date data_publicacao;
	
	
	public Noticia() {
		// TODO Auto-generated constructor stub
	}


	public Noticia(String titulo, String texto, Date data_publicacao) {
		super();
		this.titulo = titulo;
		this.texto = texto;
		this.data_publicacao = data_publicacao;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Date getDataPublicacao() {
		return data_publicacao;
	}


	public void setDataPublicacao(Date data_publicacao) {
		this.data_publicacao = data_publicacao;
	}


	@Override
	public String toString() {
		return "Noticia [id=" + id + ", titulo=" + titulo + ", texto=" + texto + ", data_publicacao=" + data_publicacao
				+ "]";
	}
	
	
	
	
	
}
