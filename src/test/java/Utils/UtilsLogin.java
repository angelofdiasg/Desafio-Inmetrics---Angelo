package Utils;

import br.com.inmetrics.pages.LoginPage;

public class UtilsLogin extends LoginPage {
	
	public void logar(String login, String senha){
		setLogin(login);
		setSenha(senha);
		entrarBtn();
	}
	
}
