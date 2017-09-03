package desafio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import desafio.model.Customer;

public interface CustomerDAO {

	public void adicionar(List<Customer> listaCustomer);
	
	public List<Customer> consultaMedia();
	
	public void media();
}
