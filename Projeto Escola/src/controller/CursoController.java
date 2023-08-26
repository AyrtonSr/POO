package controller;

import java.util.ArrayList;
import java.util.List;

import Model.Curso;
import tela.CursoInterfaceCadastro;


public class CursoController {
	List<Curso> cursos = new ArrayList<>();
	
	public void cadastrar() {
		CursoInterfaceCadastro cic = new CursoInterfaceCadastro();
		cursos.add(cic.cadastrarCurso());
		System.out.printf("Total de Cursos: %d\n", cursos.size());
				
	}
	
	public void visualizar() {
		
		for(Curso curso:cursos) {
			System.out.printf("Sigla: %s\t", curso.sigla);
			System.out.printf("Nome: %s\t", curso.nome);
			System.out.printf("Duração: %s\t", curso.duração);
			System.out.printf("Departamento: %s\n", curso.departamento.nome);
	}
}
}