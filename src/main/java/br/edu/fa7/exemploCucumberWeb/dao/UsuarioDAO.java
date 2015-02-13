package br.edu.fa7.exemploCucumberWeb.dao;

import br.edu.fa7.DatabaseUtil;
import br.edu.fa7.exemploCucumberWeb.model.Usuario;

public class UsuarioDAO {
	
	public UsuarioDAO() {
		DatabaseUtil.preparaBanco();
	}
	
	public void cadastrar(Usuario usuario) {
		DatabaseUtil.cadastrar(usuario);
	}
	
	public boolean acessar(Usuario usuario) {
		if (DatabaseUtil.obterUsuarios().contains(usuario)) {
			return true;
		} else
			return false;
	}
}
