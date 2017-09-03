package desafio.model;

public class Customer {

	private Integer id;
	private String cpfCnpj;
	private String nome;
	private Boolean isActive;
	private Double vlTotal;
	
	public Customer(){
		
	}
	
	public Customer(Integer id, String cpfCnpj, String nome, Boolean isActive, Double vlTotal) {
		super();
		this.id = id;
		this.cpfCnpj = cpfCnpj;
		this.nome = nome;
		this.isActive = isActive;
		this.vlTotal = vlTotal;
	}

	public Customer(String cpfCnpj, String nome, Boolean isActive, Double vlTotal) {
		super();
		this.cpfCnpj = cpfCnpj;
		this.nome = nome;
		this.isActive = isActive;
		this.vlTotal = vlTotal;
	}
	
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCpfCnpj() {
		return cpfCnpj;
	}
	public void setCpfCnpj(String cpfCnpj) {
		this.cpfCnpj = cpfCnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Boolean getIsActive() {
		return isActive;
	}
	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public Double getVlTotal() {
		return vlTotal;
	}
	public void setVlTotal(Double vlTotal) {
		this.vlTotal = vlTotal;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", cpfCnpj=" + cpfCnpj + ", nome=" + nome + ", isActive=" + isActive
				+ ", vlTotal=" + vlTotal + "]";
	}
	
	
}
