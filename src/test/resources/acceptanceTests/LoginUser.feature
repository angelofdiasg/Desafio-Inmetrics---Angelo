Feature: LoginUser
	
	Scenario: Logar um usuário aleatório
		
	Given Abrir o site login "http://www.inmrobo.tk/accounts/login/"
	
	When Digitar o login cadastrado "usuario-1480986178" no campo "login"
	
	And Digitar a senha cadastrada "senha" no campo "senha"
	
	And E clicar no "Entre"
	
	Then Deve aparecer o grid "tabela_wrapper"