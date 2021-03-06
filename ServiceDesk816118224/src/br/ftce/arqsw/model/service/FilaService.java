package br.ftce.arqsw.model.service;

import java.io.IOException;
import java.util.ArrayList;

import br.ftce.arqsw.model.dao.FilaDAO;
import br.ftce.arqsw.model.entity.Fila;

public class FilaService {
	private FilaDAO dao;
	
	public FilaService(){
		dao = new FilaDAO();
	}
	
	public ArrayList<Fila> listarFilas() throws IOException{
		return dao.listarFilas();
	}
	
	public Fila carregar(int id) throws IOException{
		return dao.carregar(id);
	}

}
