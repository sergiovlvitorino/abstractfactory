package com.test;

import com.dao.DAOFactory;
import com.dao.PessoaDAO;
import com.dao.SGBD;
import com.domain.Pessoa;

public class Start {

	public static void main(String[] args) {
		
		DAOFactory daoFactory = DAOFactory.getInstance(SGBD.MYSQL);
		
		PessoaDAO pessoaDAO = daoFactory.getPessoaDAO();
		
		pessoaDAO.salvar(new Pessoa(1 , "SerginhoVittorino"));
		
	}
	
}
