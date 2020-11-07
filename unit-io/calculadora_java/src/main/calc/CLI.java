package calc;

public class CLI {

	public static void main(String[] args) {
		ArmazenamentoArquivo armazenamento = new ArmazenamentoArquivo("historico.txt");
		Calculadora c = new Calculadora(armazenamento);
		
		System.out.println("10 + 2 = " + c.somar(10, 2));
		System.out.println("10 - 2 = " + c.subtrair(10, 2));
		System.out.println("10 * 2 = " + c.multiplicar(10, 2));
		System.out.println("10 / 2 = " + c.dividir(10, 2));
		
	}

}
