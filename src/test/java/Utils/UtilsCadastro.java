package Utils;

import java.util.Random;

import br.com.inmetrics.pages.CadastroPage;

public class UtilsCadastro extends CadastroPage {
	
	public void cadastrar(String login, String senha){
		setLoginCadastro(login);
		setSenhaCadastro(senha);
		setConfirmarSenhaCadastro(senha);
		cadastrarBtn();
	}
	
	public static int randomNumber(){
		Random rNumber = new Random();
		return rNumber.nextInt();
		
	}

}
