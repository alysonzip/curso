def calcular_media(*notas):
    #Calcula a média de uma quantidade variável de notas.
    if len(notas) == 0:
        return 0
    return sum(notas) / len(notas)


def obter_maior_nota(*notas):
    #Retorna a maior nota obtida pelo aluno.
    if len(notas) == 0:
        return 0
    return max(notas)


def verificar_situacao(media):
    # Verifica a situação do aluno com base na média final.
    if media >= 7:
        return "Aprovado"
    elif media >= 5:
        return "Recuperação"
    else:
        return "Reprovado"


def exibir_relatorio(nome, media, situacao, maior_nota):
    # Exibe um relatório com as informações do aluno.
    print("\n" + "=" * 40)
    print("RELATÓRIO DO ALUNO")
    print("=" * 40)
    print(f"Nome: {nome}")
    print(f"Média Final: {media:.2f}")
    print(f"Maior Nota: {maior_nota:.2f}")
    print(f"Situação: {situacao}")
    print("=" * 40 + "\n")


def main():
    # Função principal do programa.
    nome = input("Digite o nome do aluno: ")
    
    notas = []
    for i in range(3):
        while True:
            try:
                nota = float(input(f"Digite a nota {i + 1}: "))
                if 0 <= nota <= 10:
                    notas.append(nota)
                    break
                else:
                    print("Nota deve estar entre 0 e 10!")
            except ValueError:
                print("Digite um valor numérico válido!")
    
    media = calcular_media(*notas)
    maior_nota = obter_maior_nota(*notas)
    situacao = verificar_situacao(media)
    
    exibir_relatorio(nome, media, situacao, maior_nota)


if __name__ == "__main__":
    main()
