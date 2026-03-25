nota = float(input("Digite a sua média final(0 a 10): "))
presenca = int(input("Digite a presença em % (0 a 100): "))

if(nota>10 or nota<0):
    print("nota invalida")
elif (presenca <0 or presenca>100):
    print("presença inválida")
elif(nota >=6 and presenca>=75):
    print("Aprovado")
elif (nota >= 4 and presenca >= 75):
    print("Exame")
else:
    print("Reprovado")
