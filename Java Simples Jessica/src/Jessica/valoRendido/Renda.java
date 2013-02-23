package Jessica.valoRendido;
import java.util.*;

public class Renda {
	public double investimento;
	public double desejado;
	public double rendaMes;
	public float porcentagem;

	public void totalMeses(){
		int mes = 0;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Qual o valor a ser investido?");
		investimento = s.nextDouble();
		System.out.println("Qual o valor desejado a ser recebido?");
		desejado = s.nextDouble();
		do{
			
			investimento = 0.007 * investimento + investimento ;
			mes = mes + 1;
			
		}while( investimento <= desejado);
		
		System.out.println("O total de meses para o dinheiro ser obtido é: "+mes+" meses");
	
		}
}



		
			
			
		


