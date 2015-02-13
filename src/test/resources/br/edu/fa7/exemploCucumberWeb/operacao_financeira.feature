# language: pt

Funcionalidade: Logar

	Cenário: Usuario/senha invalidos
		Dado que esteja na tela de Login
		Quando informar o nome "Sofia"
		E informar a senha "abc123"
		E efetuar o login
		Então o sistema apresenta a mensagem Usuario/senha invalidos
		
	Cenário: Usuario/senha validos
		Dado que esteja na tela de Login
		Quando informar o nome "Sofia"
		E informar a senha "qwerty"
		E efetuar o login
		Então o sistema apresenta a tela de Principal