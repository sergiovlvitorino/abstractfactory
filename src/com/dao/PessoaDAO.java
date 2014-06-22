package com.dao;

import java.util.List;

import com.domain.Pessoa;

public abstract class PessoaDAO {
	
	public abstract void salvar(Pessoa pessoa);
	
	public abstract List<Pessoa> getPessoaByNome(String nome);

}
