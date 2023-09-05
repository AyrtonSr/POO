package Tela;

import java.util.Scanner;

import Controller.AlunoController;
import Controller.CampusController;
import Controller.CursoController;
import Controller.DepartamentoController;

public class MenuEscolaInterface {
	public void mostrarMenu() {
		Scanner opcaoMenu = new Scanner(System.in);		
		int opcao = 0;
		AlunoController alunoController = new AlunoController();
		CursoController cursoController = new CursoController();
		DepartamentoController departamentoController = new DepartamentoController();
		CampusController campusController = new CampusController();
		
		do{
			System.out.println("1. Cadastrar um Aluno");
			System.out.println("2. Listar Aluno");
			System.out.println("3. Cadastrar um Curso");
			System.out.println("4. Listar Curso");
			System.out.println("5. Cadastrar um Departamento");
			System.out.println("6. Listar Departamento");
			System.out.println("7. Cadastrar um Campus");
			System.out.println("8. Listar Campus");
			System.out.println("9. Sair");
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
			case 5: 
					departamentoController.cadastrar();
				break;
			case 6:
					departamentoController.visualizar();
				break;
			case 7: 
					campusController.cadastrar();
				break;
			case 8:
					campusController.visualizar();
				break;
			case 9:
				break;
			default :
				System.out.print  ("Opção invalida!\n");
				
			}
		} while(opcao !=9);
	}
}