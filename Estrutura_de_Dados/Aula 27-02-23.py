def POS(cadeia, subcadeia):

    achou = 0
    tamc = len(cadeia)
    tams = len(subcadeia)

    if(tamc>=tams):
        inicio = 0
        while(tamc>=tams) and (achou==0):
            i = 0
            j = inicio
            if (subcadeia[i] == cadeia[j]):
                local = j
                i += 1
                j += 1
                while (i<tams) and (subcadeia[i] == cadeia[j]):
                    i += 1
                    j += 1
                if(i<tams):
                    inicio += 1
                    tamc -= 1
                else:
                    achou = 1
            else:
                inicio += 1
                tamc -= 1
    else:
        print("A subcadeia tem tamanho maior que a cadeia !")
    if(achou == 0):
        local = -1
    return local

cadeia = "ROBERTO DE SOUZA PORTO"

# print(nome[0])
# print(nome[-7])
# print(nome[2 * 9]) # o ultimo valor não e usado
# print(cadeia.count("P")) #conta quantos caracteres tem de retornando de forma explícita
print(cadeia.find("2")) #encontra
print(POS(cadeia,"2"))

lista = cadeia.split()
print (lista)
print(lista[3])