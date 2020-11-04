Feature: AddNewEmployee
	
	Scenario: Adicionar um empregado
		
	Given Abrir site para editar "http://www.inmrobo.tk/accounts/login/"
	
	When Digitar login para editar "usuario-1480986178" no campo "login"
	
	And Digitar senha para editar "senha" no campo "senha"
	
	And Entrar e editar "Entre"
	
	And Clicar em Editar
	
	And Editar Nome "João do inputNome"
	
	And Editar Cargo "Analista de inputCargo"
	
	And Editar Salário "700000"
	
	And Selecionar Tipo Contratação PJ
	
	And Clicar Enviar
	
	Then Edição "Sucesso"