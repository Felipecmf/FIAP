valor = float(input("Digite o valor do produto: "))
parcelas = int(input("Digite a quantidade de parcelas: "))
taxa = 0.02
total = valor * (1 + taxa) ** parcelas
print("O valor total para pagamento é de: ", total)