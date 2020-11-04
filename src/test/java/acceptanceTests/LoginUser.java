package acceptanceTests;



import static org.junit.Assert.assertTrue;
import br.com.inmetrics.teste.support.Hooks;
import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.pages.CadastroPage;
import br.com.inmetrics.pages.GridEmpregadosPage;
import br.com.inmetrics.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginUser extends Hooks {


	LoginPage pageLogin = new LoginPage();
	CadastroPage pageCadastro = new CadastroPage();
	GridEmpregadosPage empregadoPage = new GridEmpregadosPage();

	@Given("^Abrir o site login \"(.*?)\"$")
	public void abrir_o_site_login(String site) throws Throwable {
		DriverFactory.getDriver().get(site);
	}

	@When("^Digitar o login cadastrado \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_o_loginusr(String login,String str) throws Throwable {
		pageLogin.setLogin(login);
	}
	
	@When("^Digitar a senha cadastrada \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_a_senhausr(String senha,String str) throws Throwable {
		pageLogin.setSenha(senha);
	}
	
	@When("^E clicar no \"(.*?)\"$")
	public void e_clicar_no_entra(String botao) throws Throwable {
		pageLogin.entrarBtn();
	}
	
	@Then("Deve aparecer o grid \"(.*?)\"$")
	public void deve_aparecer_o_grid(String id) throws Throwable {
		assertTrue(empregadoPage.gridDisplayed(id));
	}
	
}
