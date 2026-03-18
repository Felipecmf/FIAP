Nome = input("Digite seu nome: ")
Qntvd = int(input("Digite a quantidade de produtos vendidos: "))
Vlvd = float(input("Digite o valor total das vendas: "))

base = 1800
com = Qntvd * 150
tax = Vlvd * 1.03

print(tax)
print(com)
print("Olá ", Nome, "o seu salário desse mês é: R$", base+com+tax)