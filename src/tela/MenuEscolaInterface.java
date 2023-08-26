package tela;

import java.util.Scanner;

import controller.AlunoController;
import controller.CursoController;

public class MenuEscolaInterface {
	public void mostrarMenu() {
		Scanner opcaoMenu = new Scanner(System.in);		
		int opcao = 0;
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		do{
			System.out.println("1. Cadastrar um Aluno");
			System.out.println("2. Listar Aluno");
			System.out.println("3. Cadastrar um Curso");
			System.out.println("4. Listar Curso");
			System.out.println("5. Sair");
			System.out.print  ("Escolha uma Opção: ");
			opcao = opcaoMenu.nextInt();
			
			switch (opcao) {
			case 1: 
					alunoController.cadastrar();
					break;
				
			case 2:
					alunoController.visualisar();
					break;
			case 3:
					cursoController.cadastrar();
					break;
			case 4:
					cursoController.visualizar();
					break;
			}
		} while(opcao !=5);
	}
}
