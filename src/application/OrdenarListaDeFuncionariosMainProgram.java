package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import model.entities.Funcionario;

/**
 * Para testar este exemplo crie HardCode um file com nomes e valores double separados por virgula sem estar ordenados alfabeticamente no /tmp.
 * 
 * @author julian
 *
 */
public class OrdenarListaDeFuncionariosMainProgram {

	public static void main(String[] args) {
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>();
		String path = "/tmp/funcionarios.csv";
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String funcionario = br.readLine();
			String[] campo;
			while (funcionario != null) {
				campo = funcionario.split(",");
				listaFuncionarios.add(new Funcionario(campo[0],Double.parseDouble(campo[1])));
				funcionario = br.readLine();
			}
			Collections.sort(listaFuncionarios);
			for (Funcionario func : listaFuncionarios) {
				System.out.println(func.getNome() + ", " + func.getSalario());
			}
		} catch (IOException e) {
			System.err.println("Erro: " + e.getMessage());
		}
	}

}
