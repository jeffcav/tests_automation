package calc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ArmazenamentoArquivo implements IArmazenamento {
	private String arquivo;
	
	public ArmazenamentoArquivo(String arq) {
		this.arquivo = arq;
		(new File(arquivo)).delete();
	}

	public void registrar(int resultado) {
		try
		{
		    FileWriter fw = new FileWriter(arquivo, true);
		    fw.write(String.valueOf(resultado) + "\n");
		    fw.close();
		}
		catch(IOException ioe) {}
	}


	public ArrayList<Integer> lerHistorico() {
		ArrayList<Integer> historico = new ArrayList<>();
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(arquivo));
			String linha;
			
			while ((linha = br.readLine()) != null) {
				historico.add(Integer.valueOf(linha));
			}
			br.close();
			
		}
		catch(IOException ioe){}
		
		return historico;
	}

}
