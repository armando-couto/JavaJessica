package Jessica.Banco;

public class conta {
	private int agencia;
	private int numero;
	private String nomeBanco;
	private String nomeTitular;
	
	public int getAgencia(){
		return agencia;
		
	}
    public void setAgencia(int agencia){
	this.agencia = agencia;
}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

}
