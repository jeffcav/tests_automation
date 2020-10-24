from calculadora import Calculadora

def main():
    calc = Calculadora()
    print("2 + 4 = ", calc.somar(2, 4)) #6
    print("3 - 5 = ", calc.subtrair(3, 5)) #-2
    print("2 * 4 = ", calc.multiplicar(4, 5)) #20
    print("2 / 4 = ", calc.dividir(100, 20)) #5

if __name__ == "__main__":
    main()