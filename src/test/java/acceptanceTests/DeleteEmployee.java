package acceptanceTests;



import static org.junit.Assert.assertTrue;
import br.com.inmetrics.teste.support.Hooks;
import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.pages.GridEmpregadosPage;
import br.com.inmetrics.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DeleteEmployee extends Hooks {


	LoginPage pageLogin = new LoginPage();
	GridEmpregadosPage empregadoPage = new GridEmpregadosPage();

	@Given("^Abrir o site e logar \"(.*?)\"$")
	public void abrir_o_site_login(String site) throws Throwable {
		DriverFactory.getDriver().get(site);
	}

	@When("^Digitar login cadastrado \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_loginusr(String login,String str) throws Throwable {
		pageLogin.setLogin(login);
	}
	
	@When("^Digitar senha cadastrada \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_senhausr(String senha,String str) throws Throwable {
		pageLogin.setSenha(senha);
	}
	
	@When("^Clicar para entrar \"(.*?)\"$")
	public void clicar_para_entrar(String botao) throws Throwable {
		pageLogin.entrarBtn();
	}
	
	@When("^Clicar para deletar \"(.*?)\"$")
	public void clicar_para_deletar(String botao) throws Throwable {
		empregadoPage.deletarPrimeiroItem();
	}
	
	@Then("^Deve aparecer a mensagem de \"(.*?)\"$")
	public void deve_aparecer_home(String mensagem) throws Throwable {
		assertTrue(empregadoPage.pupUpAlert());
	}
	
//	public void deve_aparecer_home(String output) throws Throwable {
//		String was = empregadoPage.obterStatus();
//		assertThat(output).isEqualTo(was);
////		assertTrue(pageLogin.boxLoginDisplayed());
//	}
	
}
