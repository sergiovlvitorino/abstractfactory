package com.dao;

import java.util.List;

import com.domain.Livro;

public abstract class LivroDAO {

	public abstract void salvar(Livro livro);
	
	public abstract List<Livro> getLivrosByTitulo(String titulo);
	
}
