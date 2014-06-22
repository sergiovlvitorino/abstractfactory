package com.dao.mysql;

import com.dao.DAOFactory;
import com.dao.LivroDAO;
import com.dao.PessoaDAO;

public class MysqlDAOFactory extends DAOFactory {

	@Override
	public PessoaDAO getPessoaDAO() {
		return new MysqlPessoaDAO();
	}

	@Override
	public LivroDAO getLivroDAO() {
		return new MysqlLivroDAO();
	}

}
