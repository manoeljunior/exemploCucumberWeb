package br.edu.fa7.exemploCucumberWeb.page;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	private WebDriver driver;
	private WebDriverWait wait;
	
	public LoginPage() {
		driver = new FirefoxDriver();
	}
	
	public void acessar() {
		driver.get("http://localhost:8080/exemploCucumberWeb/login.xhtml");
	}

	public void preencherNome(String nome) {
		WebElement element = driver.findElement(By.id("loginForm:nome"));
		element.clear();
		element.sendKeys(nome);
	}
	
	public void preencherSenha(String senha) {
		WebElement element = driver.findElement(By.id("loginForm:senha"));
		element.clear();
		element.sendKeys(senha);
	}
	
	public void fechaBrowser() {
		
	}

	public void logar() {
		
		WebElement element = driver.findElement(By.id("loginForm:logar"));
		element.click();
	}

	public String obterMensagem() {
		wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.className("ui-messages-error-detail")));
		
		WebElement element = driver.findElement(By.className("ui-messages-error-detail"));
		return element.getText();
	}
	
	public boolean findMessage(String message) {
		List<WebElement> elements = driver.findElements(By.xpath("html/body/ul/li"));
		for (WebElement element : elements) {
			System.out.println("texto: " + element.getText());
			if (element.getText().equalsIgnoreCase(message))
				return true;
		}
		return false;
	}
	
}
