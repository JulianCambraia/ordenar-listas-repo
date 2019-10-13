package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Para testar este exemplo crie HardCode um file com nomes sem estar ordenados alfabeticamente no /tmp.
 * 
 * @author julian
 *
 */
public class OrdenarNomesMainProgram {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		String path = "/tmp/in.txt";
		try(BufferedReader br = new BufferedReader(new FileReader(path))) {
			String nome = br.readLine();
			while (nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			Collections.sort(lista);
			for (String string : lista) {
				System.out.println(string);
			}
		} catch (IOException e) {
			System.err.println("Erro :" + e.getMessage());
		}
	}
}
