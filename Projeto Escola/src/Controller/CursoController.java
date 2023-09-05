package Controller;

import java.util.ArrayList;
import java.util.List;

import Model.Curso;
import Tela.CursoInterfaceCadastro;


public class CursoController {
	List<Curso> cursos = new ArrayList<>();
	
	public void cadastrar() {
		CursoInterfaceCadastro cic = new CursoInterfaceCadastro();
		cursos.add(cic.cadastrarCurso());
		System.out.printf("Total de Cursos: %d\n", cursos.size());
				
	}
	
	public void visualizar() {
		
		for(Curso curso:cursos) {
			System.out.printf("Sigla: %s\t", curso.getSigla());
			System.out.printf("Nome: %s\t", curso.getNome());
			System.out.printf("Duração: %s\n", curso.getDuração());
			//System.out.printf("Departamento: %s\n", curso.getDepartamento());
	}
}
}