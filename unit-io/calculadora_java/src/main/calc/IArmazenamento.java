package calc;

import java.util.ArrayList;

public interface IArmazenamento {
	void registrar(int resultado);
	
	ArrayList<Integer> lerHistorico();
}
