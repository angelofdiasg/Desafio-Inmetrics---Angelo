Feature: DeleteEmployee
	
	Scenario: Deletar um empregado
		
	Given Abrir o site e logar "http://www.inmrobo.tk/accounts/login/"
	
	When Digitar login cadastrado "usuario-1480986178" no campo "login"
	
	And Digitar senha cadastrada "senha" no campo "senha"
	
	And Clicar para entrar "Entre"
	
	And Clicar para deletar "Delete"
	
	Then Deve aparecer a mensagem de "Sucesso"