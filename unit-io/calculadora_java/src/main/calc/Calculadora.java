package calc;

import java.util.ArrayList;

public class Calculadora {
	private ArmazenamentoArquivo historico;
	
	public Calculadora(ArmazenamentoArquivo arm) {
		this.historico = arm;
	}
	
	public int somar(int a, int b) {
		int resultado = a + b; 
		this.historico.registrar(resultado);
		return resultado;
	}
	
	public int subtrair(int a, int b) {
		int resultado = a - b;
		this.historico.registrar(resultado);
		return resultado;
	}
	
	public int multiplicar(int a, int b) {
		int resultado = a * b;
		this.historico.registrar(resultado);
		return resultado;
	}
	
	public int dividir(int a, int b) {
		int resultado = a / b;
		this.historico.registrar(resultado);
		return resultado;
	}
	
	public ArrayList<Integer> lerHistorico() {
		return this.historico.lerHistorico();
	}
}
