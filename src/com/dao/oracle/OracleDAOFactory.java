package com.dao.oracle;

import com.dao.DAOFactory;
import com.dao.LivroDAO;
import com.dao.PessoaDAO;

public class OracleDAOFactory extends DAOFactory{

	@Override
	public PessoaDAO getPessoaDAO() {
		return new OraclePessoaDAO();
	}

	@Override
	public LivroDAO getLivroDAO() {
		return new OracleLivroDAO();
	}

}
