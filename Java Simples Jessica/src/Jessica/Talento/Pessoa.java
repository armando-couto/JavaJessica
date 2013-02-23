package Jessica.Talento;

public class Pessoa {
	public Pessoa (int idade){
		this.idade = idade;
	}
	
	public Pessoa pai;
	
	public int idade;
	
	public void imprimiridade(){
		System.out.println("idade = "+idade);
	}
	public int imprimeDobroIdade(){
		return 2*idade;
	
	}
	public int multiplica(int valor){
	return idade*valor;
	}
}
