package desafio.view;

import controller.CustomerController;

public class CustomerView {
	
	public static void main(String[] args) {
		
		CustomerController controle = new CustomerController();
		controle.adicionaDados();
		System.out.println("Dados adicionados com sucesso");
		System.out.println("Consulta: \n");
		controle.consultaMediaUtil();
		
		System.out.println("Mostra media: \n");
		controle.consultaMedia();
	}
}
