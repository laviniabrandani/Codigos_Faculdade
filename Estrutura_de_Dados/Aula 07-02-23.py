EXERCÍCIO 1:

n = 4 
lista = [0] * n
i = 0

while i < n:
    lista[i] = float(input("Digite um número: "))
    i += 1

i = 0
maior = lista[i]
menor = lista[i]

while i < n:
    if lista[i]<menor:
        menor = lista[i]
    elif lista[i]>maior:
        maior = lista[i]
    i += 1

print("O menor número é: ", menor)
print("O maior número é: ", maior)

=========================================================================
EXERCÍCIO 2:

numero = float(input("Digite um número: "))
fat = 1

while numero > 1:
  fatorial = fatorial * numero
  numero = numero - 1

print("O resultado do fatorial é : ", fat)

=========================================================================
EXERCÍCIO 3:

alunos = int(input("Digite a quantidade de alunos: "))
notas = [0] * alunos
i = 0
totalNotas = 0

while i < alunos:
    notas[i] = float(input("Digite a nota do aluno: "))
    totalNotas = totalNotas + notas[i]
    i += 1

media = totalNotas / alunos

i = 0
acimaMedia = 0
abaixoMedia = 0

while i < alunos:
    if notas[i] > media:
        acimaMedia = acimaMedia + 1
    
    if notas[i] > media:
        abaixoMedia = abaixoMedia + 1

    i += 1

percentualAcima = (acimaMedia / alunos) * 100
percentualAbaixo = (abaixoMedia / alunos) * 100

print("A média é: ", media)
print("O percentual de alunos acima da média: ", percentualAcima)
print("O percentual de alunos abaixo da média: ", percentualAbaixo)