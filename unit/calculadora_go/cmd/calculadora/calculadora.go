package main

type Calculadora struct {
	historico []int
}

func (c Calculadora) Somar(a, b int) int {
	resultado := a + b
	c.adicionarAoHistorico(resultado)
	return resultado
}

func (c Calculadora) Subtrair(a, b int) int {
	resultado := a - b
	c.adicionarAoHistorico(resultado)
	return resultado
}

func (c Calculadora) Multiplicar(a, b int) int {
	resultado := a * b
	c.adicionarAoHistorico(resultado)
	return resultado
}

func (c Calculadora) Dividir(a, b int) int {
	resultado := a / b
	c.adicionarAoHistorico(resultado)
	return resultado
}

func (c Calculadora) adicionarAoHistorico(a int) {
	c.historico = append(c.historico, a)
}

func (c Calculadora) lerHistorico() ([]int) {
	return c.historico
}