Feature: AddNewEmployee
	
	Scenario: Adicionar um empregado
		
	Given Abrir site e logar "http://www.inmrobo.tk/accounts/login/"
	
	When Digitar aquele login cadastrado "usuario-1480986178" no campo "login"
	
	And Digitar aquela senha cadastrada "senha" no campo "senha"
	
	And Entrar "Entre"
	
	And Clicar em Novo "Funcionario"
	
	And Preencher Nome "João do inputNome"
	
	And Preencher Cargo "Analista de inputCargo"
	
	And Preencher CPF "070.546.457-15"
	
	And Preencher Salário "7000"
	
	And Selecionar Sexo "Indiferente"
	
	And Preencher Admissão "01012021"
	
	And Selecionar Tipo Contratação CLT "clt"
	
	And Clicar em Enviar
	
	Then Só "Sucesso"