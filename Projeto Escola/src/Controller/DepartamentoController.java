package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Departamento;
import Tela.DepartamentoInterfaceCadastro;


public class DepartamentoController {

	List<Departamento> departamentos = new ArrayList<>();
	
	public void cadastrar() {
		DepartamentoInterfaceCadastro dic = new DepartamentoInterfaceCadastro();
		departamentos.add(dic.cadastrarDepartamento());
		System.out.printf("Total de Departamentos: %d\n", departamentos.size());
		
	}
	
	public void visualizar() {
		
		for(Departamento departamento:departamentos) {
			System.out.printf("Sigla: %s\t", departamento.getSigla());
			System.out.printf("Nome: %s\n", departamento.getNome());
			//System.out.printf("Duração: %s\t", departamento.get());
			//System.out.printf("Departamento: %s\n", curso.getDepartamento());
	}
	}
}
