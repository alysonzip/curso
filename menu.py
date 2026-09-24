import os

def limpa_tela():
	os.system("cls" if os.name == "nt" else "clear")


def entradadados():
	nome = input("Digite seu nome: ")
	while True:
		try:
			idade = int(input(f"Digite sua idade, {nome}: "))
			break
		except ValueError:
			print("Digite uma idade válida.")

	matricula = input(f"Digite sua matrícula, {nome}: ")
	return nome, idade, matricula


def perguntas():
	perguntas_lista = [
		"filme favorito",
		"livro favorito",
		"esporte favorito",
		"comida favorita",
		"cor favorita",
		"animal favorito",
		"lugar favorito",
		"hobby favorito",
		"cantor/banda favorito",
		"jogo favorito",
	]
	return {
		pergunta: input(f"Digite seu {pergunta}: ")
		for pergunta in perguntas_lista
	}


def cadastrar_usuario(usuarios):
	limpa_tela()
	nome, idade, matricula = entradadados()
	respostas = perguntas()
	usuarios.append({
		"nome": nome,
		"idade": idade,
		"matricula": matricula,
		"respostas": respostas,
	})
	print("\nUsuário cadastrado com sucesso!")
	input("Pressione Enter para continuar...")


def ver_usuarios(usuarios):
	limpa_tela()
	if not usuarios:
		print("Nenhum usuário cadastrado.")
	else:
		print("=== USUÁRIOS CADASTRADOS ===")
		for indice, usuario in enumerate(usuarios, start=1):
			print(f"{indice}. {usuario['nome']} - Matrícula: {usuario['matricula']}")
	input("\nPressione Enter para continuar...")


def ver_respostas(usuarios):
	limpa_tela()
	if not usuarios:
		print("Nenhum usuário cadastrado.")
	else:
		for indice, usuario in enumerate(usuarios, start=1):
			print(f"\n=== {indice}. {usuario['nome']} ===")
			print(f"Idade: {usuario['idade']}")
			print(f"Matrícula: {usuario['matricula']}")
			for pergunta, resposta in usuario["respostas"].items():
				print(f"{pergunta.title()}: {resposta}")
	input("\nPressione Enter para continuar...")


def menu():
	usuarios = []
	while True:
		limpa_tela()
		print("=== MENU ===")
		print("1 - Cadastrar usuário")
		print("2 - Ver usuários")
		print("3 - Ver usuários e suas respostas")
		print("0 - Sair")
		opcao = input("Escolha uma opção: ")

		if opcao == "1":
			cadastrar_usuario(usuarios)
		elif opcao == "2":
			ver_usuarios(usuarios)
		elif opcao == "3":
			ver_respostas(usuarios)
		elif opcao == "0":
			print("Programa encerrado.")
			break
		else:
			print("Opção inválida.")
			input("Pressione Enter para continuar...")


if _name_ == "_main_":
	menu()
