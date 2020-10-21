package calc;

import java.util.ArrayList;

import junit.framework.TestCase;


public class CalculadoraTeste extends TestCase {
	
	public void testeSomaPositiva() {
		Calculadora c = new Calculadora();
		int resultado = c.somar(10, 2);
		
		assertEquals(12, resultado);
	}
	
	
	public void testDivisaoPorZero() {
		Calculadora c = new Calculadora();
		Throwable e = null;
		
		try {
			c.dividir(10, 0);
		} catch (Throwable ex) {
			e = ex;
		}
		
		assertTrue(e instanceof java.lang.ArithmeticException);
	}
	
	public void testeHistorico() {
		int resultado;
		Calculadora c = new Calculadora();
		ArrayList<Integer> historicoEsperado = new ArrayList<>();
		
		resultado = c.somar(3, 2);
		historicoEsperado.add(resultado);
		
		resultado = c.subtrair(1, 2);
		historicoEsperado.add(resultado);
		
		resultado = c.multiplicar(2, 2);
		historicoEsperado.add(resultado);
		
		resultado = c.dividir(4, 2);
		historicoEsperado.add(resultado);
		
		ArrayList<Integer> historico = c.lerHistorico();
		
		for (int i = 0; i < historicoEsperado.size(); i++) {
			assertEquals(historicoEsperado.get(i), historico.get(i));
		}
	}
}
