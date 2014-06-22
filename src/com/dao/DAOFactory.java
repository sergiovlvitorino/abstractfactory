package com.dao;

import com.dao.mysql.MysqlDAOFactory;
import com.dao.oracle.OracleDAOFactory;

public abstract class DAOFactory {

	
	public static DAOFactory getInstance(SGBD sgbd){
		switch (sgbd) {
		case MYSQL:
			return new MysqlDAOFactory();
		case ORACLE:
			return new OracleDAOFactory();
		default:
			throw new IllegalArgumentException("SGBD n�o encontrado.");
		}
	}
	
	public abstract PessoaDAO getPessoaDAO(); 
	
	public abstract LivroDAO getLivroDAO();
	
}
