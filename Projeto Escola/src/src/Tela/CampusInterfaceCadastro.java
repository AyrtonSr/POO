package Tela;

import java.util.Scanner;

import Model.Campus;

public class CampusInterfaceCadastro {
	public Campus cadastrarCampus() {
		Campus campus = new Campus();
		Scanner esigla = new Scanner (System.in);
		Scanner enomeCampus = new Scanner (System.in);
		Scanner ecidadeCampus = new Scanner (System.in);
		Scanner ebairroCampus = new Scanner (System.in);
		
		System.out.print("Informe o Nome do Campus: ");
		campus.setSigla(enomeCampus.nextLine()); 
		
		System.out.print("Informe a sigla do Campus: ");
		campus.setNome( esigla.next()); 
		
		System.out.print("Informe a Cidade do Campus: ");
		campus.setCidade(ecidadeCampus.nextLine());
		
		System.out.print("Informe o Bairro do Campus: ");
		campus.setBairro(ebairroCampus.nextLine());
		
		return campus;
	}

}
