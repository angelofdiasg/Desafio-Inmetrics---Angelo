Feature: AddAUser
	
	Scenario: Cadastrar um usuário aleatório
		
	Given Abrir o site "http://www.inmrobo.tk/accounts/login/"
	
	When Clicar em "Cadastra-se"
	
	And Digitar o login "usuario" no campo "login"
	
	And Digitar a senha "senha" no campo "senha"
	
	And Digitar a confirmação da senha "senha" no campo "confirmacaosenha"
	
	And E clicar em "Cadastrar"
	
	Then "Login" deve aparecer em "Box"