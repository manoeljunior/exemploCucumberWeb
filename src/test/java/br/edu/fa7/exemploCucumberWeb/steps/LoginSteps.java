package br.edu.fa7.exemploCucumberWeb.steps;

import static org.junit.Assert.assertEquals;
import br.edu.fa7.DatabaseUtil;
import br.edu.fa7.exemploCucumberWeb.page.LoginPage;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginSteps {

	private LoginPage loginPage;
	
	@Dado("^que esteja na tela de Login$")
	public void que_esteja_na_tela_de_login() throws Throwable {
	    loginPage = new LoginPage();
	    loginPage.acessar();
	}

	@Quando("^informar o nome \"(.*?)\"$")
	public void informar_o_nome(String nome) throws Throwable {
	    loginPage.preencherNome(nome);
	}
	
	@Quando("^informar a senha \"(.*?)\"$")
	public void informar_a_senha(String senha) throws Throwable {
	    loginPage.preencherSenha(senha);
	}
	
	@Quando("^efetuar o login$")
	public void efetuar_o_login() throws Throwable {
	    loginPage.logar();
	}

	@Então("^o sistema apresenta a mensagem Usuario/senha invalidos$")
	public void o_sistema_apresenta_a_mensagem_Usuario_senha_invalidos() throws Throwable {
	   assertEquals("Usuario/senha invalidos", loginPage.obterMensagem());
	}
	
	@Então("^o sistema apresenta a tela de Principal$")
	public void o_sistema_apresenta_a_tela_de_Principal() throws Throwable {
	    new PendingException();
	}

	
	@Before
	public void preparaBanco() {
		DatabaseUtil.preparaBanco();
	}
	
	@After
	public void fecharBrowser() {
		loginPage.fechaBrowser();
	}

}
