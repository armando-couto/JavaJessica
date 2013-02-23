package Jessica.Programa3;
import java.util.*;

public class paralelepipedo {
	private float altura;
	private float largura;
	private float comprimento;
	
	public void medidas(){
		Scanner s = new Scanner (System.in);
		System.out.println("Informe a altura: ");
		altura = s.nextFloat();
		System.out.println("Informe a largura: ");
		largura = s.nextFloat();
		System.out.println("Informe o comprimento: ");
		comprimento = s.nextFloat();
		
		
	}
	public void calcularVolume(){
		double volume = altura * largura * comprimento;
		System.out.println("Volume = "+volume);
	}
	public void calcularArea(){
		double area = 2 * (altura * largura + altura * comprimento + largura * comprimento);
		System.out.println("Area = "+area);
	}
	public static void main (String args[]){
		paralelepipedo p1 = new paralelepipedo();
	    paralelepipedo p2 = new paralelepipedo();
		
		p1.medidas();
		p1.calcularArea();
		p1.calcularVolume();
		
		p2.medidas();
		p2.calcularArea();
		p2.calcularVolume();
		
		System.exit(0);
	}

}
