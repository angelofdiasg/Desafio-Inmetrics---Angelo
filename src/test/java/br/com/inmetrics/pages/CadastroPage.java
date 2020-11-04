package br.com.inmetrics.pages;

import org.openqa.selenium.By;

import br.com.inmetrics.core.DriverFactory;

public class CadastroPage {
	

	public void acessarTelaLoginNavBar() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	}
	
	public void acessarTelaLoginBox() {
		DriverFactory.getDriver().findElement(By.xpath("/html/body/div[2]/div/div/form/div[8]/a")).click();
	}
		
	public void setLoginCadastro(String login) {
		
		DriverFactory.getDriver().findElement(By.xpath("//input[@type='text']")).sendKeys(login);
//		DriverFactory.getDriver().findElement(By.name("username")).sendKeys(login);

	}

	public void setSenhaCadastro(String senha) {
		
		DriverFactory.getDriver().findElement(By.name("pass")).sendKeys(senha);

	}
	
	public void setConfirmarSenhaCadastro(String senha) {
		
		DriverFactory.getDriver().findElement(By.name("confirmpass")).sendKeys(senha);

	}
	
	public void cadastrarBtn(){

		DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div/div/form/div[7]/button")).click();
	}

}
