from unittest import TestCase
from calculadora import Calculadora


class TestCalculadora(TestCase):
    def test_somar(self):
        testes = [[2, 1, 3], [0, 10, 10]]

        calc = Calculadora()
        for i in range(len(testes)):
            assert calc.somar(testes[i][0], testes[i][1]) == testes[i][2]

    def test_subtrair(self):
        testes = [[1, 2, -1], [2, 2, 0]]

        calc = Calculadora()
        for i in range(len(testes)):
            assert calc.subtrair(testes[i][0], testes[i][1]) == testes[i][2]

    def test_multiplicar(self):
        testes = [[1, 2, 2], [0, 10, 0]]

        calc = Calculadora()
        for i in range(len(testes)):
            assert calc.multiplicar(testes[i][0], testes[i][1]) == testes[i][2]

    def test_dividir(self):
        testes = [[10, 1, 10], [4, 2, 2]]

        calc = Calculadora()
        for i in range(len(testes)):
            assert calc.dividir(testes[i][0], testes[i][1]) == testes[i][2]

    def test_ler_historico(self):
        entradas = [[2, 2], [2, 2], [2, 2], [2, 2]]
        saidas = [4, 0, 4, 1]

        calc = Calculadora()
        calc.somar(entradas[0][0], entradas[0][1])
        calc.subtrair(entradas[1][0], entradas[1][1])
        calc.multiplicar(entradas[2][0], entradas[2][1])
        calc.dividir(entradas[3][0], entradas[3][1])

        historico = calc.ler_historico()
        for i in range(len(saidas)):
            assert saidas[i] == historico[i]
