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

public class AddNewEmployee extends Hooks {


	LoginPage pageLogin = new LoginPage();
	GridEmpregadosPage empregadoPage = new GridEmpregadosPage();
	NewEmployeePage novoempregadopage = new NewEmployeePage();

	@Given("^Abrir site e logar \"(.*?)\"$")
	public void abrir_site_logar(String site) throws Throwable {
		DriverFactory.getDriver().get(site);
	}

	@When("^Digitar aquele login cadastrado \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_aquele_loginusr(String login,String str) throws Throwable {
		pageLogin.setLogin(login);
	}
	
	@When("^Digitar aquela senha cadastrada \"(.*?)\" no campo \"(.*?)\"$")
	public void digitar_aquela_senhausr(String senha,String str) throws Throwable {
		pageLogin.setSenha(senha);
	}
	
	@When("^Entrar \"(.*?)\"$")
	public void Entrar(String botao) throws Throwable {
		pageLogin.entrarBtn();
	}
	
	@When("^Clicar em Novo \"(.*?)\"$")
	public void clicar_para_deletar(String botao) throws Throwable {
		empregadoPage.acessarTelaNovoFuncionario();
	}

	
	@When("^Preencher Nome \"(.*?)\"$")
	public void preencher_nomenew(String name) throws Throwable {
		novoempregadopage.setName(name);
	}
	
	@When("^Preencher Cargo \"(.*?)\"$")
	public void preencher_cargonew(String cargo) throws Throwable {
		novoempregadopage.setCargo(cargo);
	}

	@When("^Preencher CPF \"(.*?)\"$")
	public void preencher_cpfnew(String cpf) throws Throwable {
		novoempregadopage.setCPF(cpf);
	}
	
	@When("^Preencher Salário \"(.*?)\"$")
	public void preencher_salarionew(String salario) throws Throwable {
		novoempregadopage.setSalario(salario);
	}

	@When("^Selecionar Sexo \"(.*?)\"$")
	public void selecionar_sexonew(String sexo) throws Throwable {
		novoempregadopage.setSexo(sexo);
	}

	@When("^Preencher Admissão \"(.*?)\"$")
	public void preencher_admissaonew(String data) throws Throwable {
		novoempregadopage.setAdmissao(data);
	}
	
	@When("^Selecionar Tipo Contratação CLT \"(.*?)\"$")
	public void selecionar_clt(String clt) throws Throwable {
		novoempregadopage.setCLT();
	}
	
	@When("^Clicar em Enviar")
	public void clicar_enviarnew() throws Throwable {
		novoempregadopage.enviarBtn();
	}
	
	@Then("^Só \"(.*?)\"$")
	public void cadastro_sucesso(String mensagem) throws Throwable {
		assertTrue(empregadoPage.pupUpAlert());
	}

}
