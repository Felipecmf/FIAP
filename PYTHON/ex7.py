num = int(input("Digite um número com 4 dígitos: "))
milhar = num // 1000
centena = (num % 1000) // 100   # "//" divide e pega a parte inteira do resultado, no caso seria 1234 dividido por 1000, que fica como 1,234, o python interpreta como apenas 1
dezena = (num % 100) // 10      # "%" é o resto da divisão
unidade = num % 10

invertido = unidade * 1000 + dezena * 100 + centena * 10 + milhar
print("Número invertido: ", invertido)