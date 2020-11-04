package br.com.inmetrics.pages;

import org.openqa.selenium.By;

import br.com.inmetrics.core.DriverFactory;

public class GridEmpregadosPage {
	

	public void acessarGridFuncionarios() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[1]/a")).click();
	}

	
	public void acessarTelaNovoFuncionario() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	}
	

	public void acessarSair() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"navbarSupportedContent\"]/ul/li[2]/a")).click();
	}
	
	public void deletarPrimeiroItem() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"delete-btn\"]/span")).click();
	}

	public void editarPrimeiroItem() {
		DriverFactory.getDriver().findElement(By.xpath("//*[@id=\"tabela\"]/tbody/tr[1]/td[6]/a[2]/button/span")).click();
	}
	
	public String statusExclusao() {
		
		return DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[1]/div")).getAttribute("value");
	}
	
    public String obterStatus() {

        return DriverFactory.getDriver().findElement(By.xpath("//*[@title='Status']")).getAttribute("value");
    }
	
	public boolean pupUpAlert(){
		return DriverFactory.getDriver().findElement(By.xpath("/html/body/div/div[1]/div")).isDisplayed();
	}
	

	public boolean gridDisplayed(String id){
		return DriverFactory.getDriver().findElement(By.id(id)).isDisplayed();
	}

}
