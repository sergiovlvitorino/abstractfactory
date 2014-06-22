package com.dao.mysql;

import java.util.List;

import com.dao.PessoaDAO;
import com.domain.Pessoa;

public class MysqlPessoaDAO extends PessoaDAO {

	@Override
	public void salvar(Pessoa pessoa) {		
	}

	@Override
	public List<Pessoa> getPessoaByNome(String nome) {
		return null;
	}

}
