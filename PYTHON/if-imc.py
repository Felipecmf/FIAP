peso = float(input("Digite sua peso:"))
altura = float(input("Digite sua altura: "))

imc = peso + (altura*altura)
print("SeuIMC é: ", imc)

if imc<18.5:
    print("Abaixo do peso")
elif imc>=25 and imc<30:
    print("Sobrepeso")
elif imc >= 30 and imc < 35:
    print("Obesidade")
elif imc >= 35 and imc < 40:
    print("Obesidade severa")
