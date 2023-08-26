package tela;

import java.util.Scanner;

import Model.Curso;
import Model.Departamento;

public class CursoInterfaceCadastro {
	public Curso cadastrarCurso() {
		Curso curso = new Curso ();
		Departamento departamento = new Departamento();
		Scanner e = new Scanner (System.in);
		
		System.out.print("Informe a Sigla do Curso: ");
		curso.sigla = e.next();
		
		System.out.print("Informe o nome do Curso: ");
		curso.nome = e.next();
		
		System.out.print("Informe a Duração: ");
		curso.duração = e.nextInt();
		
		System.out.print("Informe o Departamento: ");
		departamento.nome = e.next();
		
		curso.departamento = departamento;
		
		return curso;
}
}
