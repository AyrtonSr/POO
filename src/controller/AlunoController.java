package controller;

import java.util.ArrayList;
import java.util.List;

import Model.Aluno;
import tela.AlunoInterfaceCadastro;

public class AlunoController {
	List<Aluno> alunos = new ArrayList<>();
	
	
	public void cadastrar() {
		AlunoInterfaceCadastro aic = new AlunoInterfaceCadastro();
		alunos.add(aic.cadastrarAluno());
		System.out.printf("Total de Alunos: %d\n", alunos.size());
		
	}
	
	public void visualisar() {
		
		for(Aluno aluno:alunos) {
			System.out.printf("Matricula: %s\t", aluno.matricula);
			System.out.printf("Nome: %s\n", aluno.nome);
			
		}
	}
			
}