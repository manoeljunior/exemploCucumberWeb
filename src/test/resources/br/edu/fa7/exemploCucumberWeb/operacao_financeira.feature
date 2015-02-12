# language: pt

Funcionalidade: Logar

	Cenário: Usuario/senha invalidos
		Dado que esteja na tela de login
		Quando informar o nome Sofia
		E informar a senha 12345
		Então o sistema apresenta a mensagem Usuario/senha invalidos
		
	Cenário: Usuario/senha validos
		Dado que esteja na tela de login
		Quando informar o nome Sofia
		E informar a senha 54321
		Então o sistema apresenta a mensagem Usuario logado com sucesso