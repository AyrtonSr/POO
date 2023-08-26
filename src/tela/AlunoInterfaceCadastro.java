package tela;

import java.util.Scanner;

import Model.Aluno;

public class AlunoInterfaceCadastro {
	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno ();
		Scanner e = new Scanner (System.in);
		
		System.out.print("Informe a matrícula do Aluno: ");
		aluno.matricula = e.next();
		
		System.out.print("Informe a nome do Aluno: ");
		aluno.nome = e.next();
		
		return aluno;
	}
}
