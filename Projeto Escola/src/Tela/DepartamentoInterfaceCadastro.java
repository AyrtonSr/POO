package Tela;

import java.util.Scanner;

import Model.Departamento;

public class DepartamentoInterfaceCadastro {

		public Departamento cadastrarDepartamento() {
			
			Departamento departamento = new Departamento();
			Scanner e = new Scanner (System.in);
			Scanner enomeDepartamento = new Scanner (System.in);
			
			System.out.print("Informe a Sigla do Departamento: ");
			departamento.setSigla(e.next()); 
			
			System.out.print("Informe o nome do Departamento: ");
			departamento.setNome( enomeDepartamento.nextLine());
			
			return departamento;
		}
		
}
