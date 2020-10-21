package calc;

import java.util.ArrayList;

public class Calculadora {
	private ArrayList<Integer> historico = new ArrayList<>();
	
	public int somar(int a, int b) {
		int resultado = a + b; 
		salvarResultado(resultado);
		return resultado;
	}
	
	public int subtrair(int a, int b) {
		int resultado = a - b;
		salvarResultado(resultado);
		return resultado;
	}
	
	public int multiplicar(int a, int b) {
		int resultado = a * b;
		salvarResultado(resultado);
		return resultado;
	}
	
	public int dividir(int a, int b) {
		int resultado = a / b;
		salvarResultado(resultado);
		return resultado;
	}
	
	private void salvarResultado(int a) {
		this.historico.add(a);
	}
	
	public ArrayList<Integer> lerHistorico() {
		return this.historico;
	}
}
