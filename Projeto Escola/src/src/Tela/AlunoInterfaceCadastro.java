package Tela;

import java.util.Scanner;

import Model.Aluno;

public class AlunoInterfaceCadastro {
	public Aluno cadastrarAluno() {
		Aluno aluno = new Aluno ();
		Scanner e = new Scanner (System.in);
		Scanner enomeAluno = new Scanner (System.in);
		
		
		System.out.print("Informe a matrícula do Aluno: ");
		aluno.setMatricula(e.next()); 
		
		System.out.print("Informe a nome do Aluno: ");
		aluno.setNome(enomeAluno.nextLine()); 
		
		return aluno;
	}
}