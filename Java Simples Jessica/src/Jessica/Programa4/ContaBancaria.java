package Jessica.Programa4;
import java.util.*;


public class ContaBancaria {
	private String numero;
	private String agencia;
	private String cliente;
	private double saldo;
	
	public void entrarDados(){
		Scanner s = new Scanner (System.in);
		System.out.println("Qual o numero da conta: ");
		numero = s.next();
		System.out.println("Qual a agencia: ");
		agencia = s.next();
		System.out.println("nome do cliente:");
		cliente = s.next();
		System.out.println("Qual o saldo: ");
		saldo = s.nextDouble();
		
	}
	public void mostrarDados(){
		System.out.println("Conta:"+numero);
		System.out.println("Agencia:"+agencia);
		System.out.println("Cliente:"+cliente);
		System.out.println("Saldo:"+saldo);
	}
	public void sacar(){
		Scanner s = new Scanner (System.in);
		System.out.println("Qual o valor do saque? ");
		double saque = s.nextDouble();
		if (saque>saldo){
			System.out.println("saldo insuficiente!");
		}else{
			double novoSaldo = saldo - saque;
			System.out.println("Seu novo saldo é:"+novoSaldo);
		}
		

}
	public void depositar(){
		Scanner s = new Scanner (System.in);
		System.out.println("");
		System.out.println("Qual o valor do deposito? ");
		double deposito = s.nextDouble();
		if (deposito>0){
		double novoSaldo2 = saldo + deposito;
		System.out.println("Seu novo saldo é: "+novoSaldo2);
		}
		
		
		
		
		
	}
	public static void main (String args[]){
	  ContaBancaria p1 = new ContaBancaria();
	  p1.entrarDados();
	  p1.mostrarDados();
	  p1.sacar();
	  p1.depositar();
	  System.exit(0);
	}
}