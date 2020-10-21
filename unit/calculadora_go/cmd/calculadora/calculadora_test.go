package main

import "testing"

func TestCalculadora_SomaPositiva(t *testing.T) {
	var calc Calculadora
	somaEsperada := 13

	soma := calc.Somar(10, 2)
	if soma != somaEsperada {
		t.Errorf("Somar(10, 2) = %d; esperado %d", soma, somaEsperada)
	}
}

func TestCalculadora_Historico(t *testing.T) {
	var historicoEsperado = []int {12, -1, 0, 2}

	var calc Calculadora
	calc.Somar(10, 2)
	calc.Subtrair(1, 2)
	calc.Multiplicar(0, 5)
	calc.Dividir(4, 2)
	historico := calc.lerHistorico()

	for i, _:= range historico {
		if historico[i] != historicoEsperado[i] {
			t.Errorf(
				"Historico[%d] = %d; expected %d",
				i,
				historico[i],
				historicoEsperado[i],
			)
		}
	}
}