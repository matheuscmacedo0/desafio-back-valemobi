package desafio.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import desafio.model.Customer;

public class CustomerDAOImpl implements CustomerDAO{

	@Override
	public void adicionar(List<Customer> listaCustomer) {
		
		String sql = "INSERT INTO `valemobi`.`tb_customer_account` (`cpf_cnpj`, `nm_customer`, `is_active`, `vl_total`) "
				+ "VALUES (?, ?, ?, ?)";
		Connection conn = ConnectionFactory.connectionFactory();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			for(Customer customer : listaCustomer){
				ps.setString(1, customer.getCpfCnpj());
				ps.setString(2, customer.getNome());
				ps.setBoolean(3, customer.getIsActive());
				ps.setDouble(4, customer.getVlTotal());
				ps.addBatch();
			}
			
			ps.executeBatch();
			ConnectionFactory.close(conn, ps);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Customer> consultaMedia() {
		String sql = "SELECT * FROM tb_customer_account "
				+ "WHERE vl_total > 60 AND id_customer BETWEEN 4 "
				+ "AND 10 ORDER BY vl_total DESC";
		Connection conn = ConnectionFactory.connectionFactory();
		PreparedStatement ps;
		List<Customer> listaCustomer = new ArrayList<>();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Integer id = rs.getInt(1);
				String  cpf = rs.getString(2);
				String  nome = rs.getString(3);
				Boolean isActive = rs.getBoolean(4);
				Double vlTotal= rs.getDouble(5);
				System.out.println( id);
				System.out.println( cpf );
				System.out.println( nome );
				System.out.println( isActive );
				System.out.println(vlTotal);
				
//				listaCustomer.add(new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4),
//						rs.getDouble(5)));
			}
			ConnectionFactory.close(conn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;	
	}

	@Override
	public void media() {
		String sql = " SELECT AVG(vl_total) FROM tb_customer_account "
				+ "WHERE vl_total > 60 AND id_customer BETWEEN 4 AND 10";
		Connection conn = ConnectionFactory.connectionFactory();
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			if(rs.next()){
				Double vlTotal= rs.getDouble(5);
			}
			ConnectionFactory.close(conn, ps, rs);
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	
	

}
