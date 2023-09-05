package Tela;

import java.util.Scanner;

import Model.Curso;
import Model.Departamento;

public class CursoInterfaceCadastro {
	public Curso cadastrarCurso() {
		Curso curso = new Curso ();
		Scanner e = new Scanner (System.in);
		Scanner eNomeCurso = new Scanner (System.in);
		
		System.out.print("Informe a Sigla do Curso: ");
		curso.setSigla(e.next()); 
		
		System.out.print("Informe o nome do Curso: ");
		curso.setNome( eNomeCurso.nextLine()); 
		
		System.out.print("Informe a Duração: ");
		curso.setDuração(e.nextInt());
		
		//System.out.print("Informe o Departamento: ");
		//curso.departamento.nome = e.next();
		
		//curso.departamento = departamento;
		return curso;
}
}