package calc;

public class CLI {

	public static void main(String[] args) {
		Calculadora c = new Calculadora();
		
		System.out.println("10 + 2 = " + c.somar(10, 2));
		System.out.println("10 - 2 = " + c.subtrair(10, 2));
		System.out.println("10 * 2 = " + c.multiplicar(10, 2));
		System.out.println("10 / 2 = " + c.dividir(10, 2));
		
	}

}
