package acceptanceTests;



import static org.junit.Assert.assertTrue;
import br.com.inmetrics.teste.support.Hooks;
import br.com.inmetrics.core.DriverFactory;
import br.com.inmetrics.pages.GridEmpregadosPage;
import br.com.inmetrics.pages.LoginPage;
import br.com.inmetrics.pages.NewEmployeePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EditAEmployee extends Hooks {


	LoginPage pageLogin = new LoginPage();
	GridEmpregadosPage empregadoPage = new GridEmpregadosPage();
	NewEmployeePage novoempregadopage = new NewEmployeePage();

	@Given("^Abrir site para editar \"(.*?)\"$")
	public void abrir_site_para_editar(String site) throws Throwable {
		DriverFactory.getDriver().get(site);
	}

	@When("^Digitar login para editar \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_loginusr_para_editar(String login,String str) throws Throwable {
		pageLogin.setLogin(login);
	}
	
	@When("^Digitar senha para editar \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_senhausr_para_editar(String senha,String str) throws Throwable {
		pageLogin.setSenha(senha);
	}
	
	@When("^Entrar e editar \"(.*?)\"$")
	public void Entrar_e_editar(String botao) throws Throwable {
		pageLogin.entrarBtn();
	}
	
	@When("^Clicar em Editar")
	public void clicar_para_editar() throws Throwable {
		empregadoPage.acessarTelaNovoFuncionario();
	}

	
	@When("^Editar Nome \"(.*?)\"$")
	public void editar_nome(String name) throws Throwable {
		novoempregadopage.setName(name);
	}
	
	@When("^Editar Cargo \"(.*?)\"$")
	public void editar_cargo(String cargo) throws Throwable {
		novoempregadopage.setCargo(cargo);
	}

	@When("^Editar Salário \"(.*?)\"$")
	public void editar_salario(String salario) throws Throwable {
		novoempregadopage.setSalario(salario);
	}

	@When("^Selecionar Tipo Contratação PJ \"(.*?)\"$")
	public void editar_tipo_pj(String pj) throws Throwable {
		novoempregadopage.setPJ();
	}
	
	@When("^Clicar Enviar")
	public void clicar_enviaredit() throws Throwable {
		novoempregadopage.enviarBtn();
	}
	
	@Then("^Edição \"(.*?)\"$")
	public void cadastro_sucesso(String mensagem) throws Throwable {
		assertTrue(empregadoPage.pupUpAlert());
	}

}
