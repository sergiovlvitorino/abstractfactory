package com.dao.mysql;

import java.util.List;

import com.dao.LivroDAO;
import com.domain.Livro;

public class MysqlLivroDAO extends LivroDAO{

	@Override
	public void salvar(Livro livro) {
	}

	@Override
	public List<Livro> getLivrosByTitulo(String titulo) {
		return null;
	}

}
