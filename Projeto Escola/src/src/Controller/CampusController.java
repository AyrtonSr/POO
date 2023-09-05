package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Campus;
import Tela.CampusInterfaceCadastro;

public class CampusController {
	List<Campus> campuss = new ArrayList<>();
	
	public void cadastrar() {
		CampusInterfaceCadastro cuic = new CampusInterfaceCadastro();
		campuss.add(cuic.cadastrarCampus());
		System.out.printf("Total de Cursos: %d\n", campuss.size());
	}
	public void visualizar() {
		
		for(Campus campus:campuss) {
			System.out.printf("Nome: %s\t", campus.getNome());
			System.out.printf("Sigla: %s\t", campus.getSigla());
			System.out.printf("Cidade: %s\t", campus.getCidade());
			System.out.printf("Bairro: %s\n", campus.getBairro());
	}
	}
}
