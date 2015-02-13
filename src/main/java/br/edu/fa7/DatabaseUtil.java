package br.edu.fa7;

import java.util.ArrayList;
import java.util.List;

import br.edu.fa7.exemploCucumberWeb.model.Usuario;

public class DatabaseUtil {

	private static List<Usuario> usuarios;
	
	public static void preparaBanco() {
		Usuario usuario = new Usuario("Sofia", "qwerty");
		usuarios = new ArrayList<Usuario>();
		cadastrar(usuario);
	}

	public static void cadastrar(Usuario usuario) {
		usuarios.add(usuario);
	}

	public static List<Usuario> obterUsuarios() {
		return usuarios;
	}
}
