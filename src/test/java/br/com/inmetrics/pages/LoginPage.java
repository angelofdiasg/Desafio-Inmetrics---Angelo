package br.com.inmetrics.pages;

import static br.com.inmetrics.core.SystemConst.INMROBO;

import org.openqa.selenium.By;

import br.com.inmetrics.core.DriverFactory;

public class LoginPage {
	

	public void acessarTelaInicial() {
		DriverFactory.getDriver().get(INMROBO);
		
	}

	public void acessarTelaCadastroNavBar() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
	}
	
	public void acessarTelaCadastroBox() {
		DriverFactory.getDriver().findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div[7]/a")).click();
	}	
	
	public void setLogin(String login) {
		
		DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/input")).sendKeys(login);

	}

	public void setSenha(String senha) {
		
		DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/div[5]/input")).sendKeys(senha);

	}
	
	public void entrarBtn(){

		DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/div[6]/button")).click();
	}
	
	public boolean boxLoginDisplayed(){
		return DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/span")).isDisplayed();
	}

}
