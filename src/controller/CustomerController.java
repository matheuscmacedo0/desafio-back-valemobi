package controller;

import java.util.ArrayList;
import java.util.List;

import desafio.dao.CustomerDAO;
import desafio.dao.CustomerDAOImpl;
import desafio.model.Customer;

public class CustomerController {
	
	private List<Customer> listaCustomer =  new ArrayList<>();
	private CustomerDAO cDao = new CustomerDAOImpl();

	
	public void adicionaDados(){
		for(int i =1; i <= 15; i++){
			Customer customer = new Customer();
			customer.setCpfCnpj("155.155.155." + i );
			customer.setNome("Zézinho" + i);
			customer.setIsActive(true);
			customer.setVlTotal((10.10 * i));
			listaCustomer.add(customer);
		}
		
		cDao.adicionar(listaCustomer);
	}
	
	public void consultaMediaUtil(){
		
		listaCustomer = cDao.consultaMedia();
	}
	
	public void consultaMedia(){
			cDao.media();
		
	}
	
}
