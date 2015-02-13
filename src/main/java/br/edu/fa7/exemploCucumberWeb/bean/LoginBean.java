package br.edu.fa7.exemploCucumberWeb.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.edu.fa7.exemploCucumberWeb.model.Usuario;
import br.edu.fa7.exemploCucumberWeb.negocio.LoginRN;

@ManagedBean (name = "loginBean")
@ViewScoped
public class LoginBean {

	private String nome;
	private String senha;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String logar() {
		LoginRN loginRN = new LoginRN();
		Usuario usuario = new Usuario(nome, senha);
		boolean acesso = loginRN.logar(usuario);
		
		if (acesso) {
			return "principal.xhtml";
		} else {
			FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "erro","Usuario/senha invalidos"));
			return "";
		}
			
			 
	}
	
}
