package acceptanceTests;



import static org.junit.Assert.assertTrue;

import Utils.UtilsCadastro;
import br.com.inmetrics.teste.support.Hooks;
import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.pages.CadastroPage;
import br.com.inmetrics.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddAUser extends Hooks {


	LoginPage pageLogin = new LoginPage();
	CadastroPage pageCadastro = new CadastroPage();

	@Given("^Abrir o site \"(.*?)\"$")
	public void abrir_o_site(String site) throws Throwable {
		DriverFactory.getDriver().get(site);
	}

	@When("^Clicar em \"(.*?)\"$")
	public void clicar_em(String botao) throws Throwable {
		pageLogin.acessarTelaCadastroNavBar();
	}
	
	@When("^Digitar o login \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_o_login(String login,String str) throws Throwable {
		login = login + UtilsCadastro.randomNumber();
		System.out.println("Usuário cadastrado:");
		System.out.println(login);
		pageCadastro.setLoginCadastro(login);
	}
	
	@When("^Digitar a senha \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_a_senha(String senha,String str) throws Throwable {
		pageCadastro.setSenhaCadastro(senha);
	}
	
	@When("^Digitar a confirmação da senha \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_a_confirmacaosenha(String confirmacaosenha,String str) throws Throwable {
		pageCadastro.setConfirmarSenhaCadastro(confirmacaosenha);
	}

	@When("^E clicar em \"(.*?)\"$")
	public void e_clicar_em(String botao) throws Throwable {
		pageCadastro.cadastrarBtn();
	}
	
	@Then("^\"(.*?)\" deve aparecer em \"(.*?)\"$")
	public void deve_aparecer_tela_login(String input, String output) throws Throwable {
		assertTrue(pageLogin.boxLoginDisplayed());
	}
	
}
