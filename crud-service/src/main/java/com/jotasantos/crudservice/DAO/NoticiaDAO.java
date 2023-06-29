package com.jotasantos.crudservice.DAO;

import java.sql.SQLException;
import java.util.List;

import com.jotasantos.crudservice.modelo.Noticia;


public interface NoticiaDAO {
	public long adicionar(Noticia noticia) throws SQLException;
	public Noticia alterar(Noticia noticia) throws SQLException;
	public boolean apagar(long id) throws SQLException;
	public List<Noticia> listar() throws SQLException;
	public Noticia ler(long id) throws SQLException;

}
