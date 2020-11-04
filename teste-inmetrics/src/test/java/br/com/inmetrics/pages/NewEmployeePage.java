package br.com.inmetrics.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.inmetrics.core.DriverFactory;

public class NewEmployeePage {
	

	public void acessarGridFuncionarios() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
	}

	
	public void acessarTelaNovoFuncionario() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	}
	

	public void acessarSair() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	}
	

	public void setName(String name) {
		
		DriverFactory.getDriver().findElement(By.id("inputNome")).sendKeys(name);

	}

	public void setCargo(String cargo) {
		DriverFactory.getDriver().findElement(By.id("inputCargo")).sendKeys(cargo);
	}
	
	public void setCPF(String cpf) {
		DriverFactory.getDriver().findElement(By.id("cpf")).sendKeys(cpf);
	}
	

	public void setSalario(String salario) {
		DriverFactory.getDriver().findElement(By.id("dinheiro")).sendKeys(salario);
	}
	
	public void setAdmissao(String data) {
		DriverFactory.getDriver().findElement(By.id("inputAdmissao")).sendKeys(data);
	}
	
	public void setSexo(String sexo) {
		Select sex = new Select(DriverFactory.getDriver().findElement(By.id("slctSexo")));
		sex.selectByVisibleText(sexo);
		//fruits.selectByIndex(1);		
	}
	
	public void setCLT() {
		DriverFactory.getDriver().findElement(By.id("clt")).click();
	}
	
	public void setPJ() {
		DriverFactory.getDriver().findElement(By.id("pj")).click();
	}
	
	public void enviarBtn(){

		DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/div[3]/input")).click();
	}
	
	public void cancelarBtn(){

		DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/div[4]/input")).click();
	}

	
	
	public boolean boxLoginDisplayed(){
		return DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[2]/div/form/span")).isDisplayed();
	}

}
