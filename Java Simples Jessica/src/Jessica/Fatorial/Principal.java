package Jessica.Fatorial;

import java.util.Scanner; 

public class Principal {
	public static void main (String args[]){
		Scanner s = new Scanner (System.in);
		System.out.println("Digite o n�mero");
		int numero = s.nextInt();
		calculaFatorial fat = new calculaFatorial();
		System.out.println("O fatorial de "+numero+" �: "+fat.calculo(numero));
	
		
	}

}
