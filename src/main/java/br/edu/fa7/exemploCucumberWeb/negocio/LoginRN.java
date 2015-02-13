package br.edu.fa7.exemploCucumberWeb.negocio;

import br.edu.fa7.exemploCucumberWeb.dao.UsuarioDAO;
import br.edu.fa7.exemploCucumberWeb.model.Usuario;

public class LoginRN {

	public boolean logar(Usuario usuario) {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.acessar(usuario);
	}
}
