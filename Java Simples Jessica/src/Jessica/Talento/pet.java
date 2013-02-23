package Jessica.Talento;

public class pet {
 public String nome;
 public int idade;
 public double altura;
 
 public pet(){}
 
  public pet (int idade, String nome){
	 
	  this.idade = idade;
	  this.nome = nome;
	  
	  
  }
  public void brincar(){
	  deita();
	  come();
  }
public void deita(){
	System.out.println(nome+ " deita");
}
public void come(){
	System.out.println(nome+ " come");
}
}
