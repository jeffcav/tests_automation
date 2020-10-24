class Calculadora:
    def __init__(self):
        self.historico = []

    def somar(self, a, b):
        resultado = a + b
        self.gravar(resultado)
        return resultado

    def subtrair(self, a, b):
        resultado = a - b
        self.gravar(resultado)
        return resultado

    def multiplicar(self, a, b):
        resultado = a * b
        self.gravar(resultado)
        return resultado

    def dividir(self, a, b):
        resultado = int(a / b)
        self.gravar(resultado)
        return resultado

    def gravar(self, valor):
        self.historico.append(valor)

    def ler_historico(self):
        return self.historico
