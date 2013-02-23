package Jessica.impostoRenda;
import java.util.*;
public class imposto {
	
public void impostoPago(){
	Scanner s = new Scanner (System.in);
	System.out.println("Qual o salario?");
	double salario = s.nextDouble();
	if(salario<=1200){
		System.out.println("Nao ha imposto a ser pago!");
	}else{
		if((salario>1200)&&(salario<=1600)){
			double imposto = 0.15 * (salario - 1200);
			System.out.println("O imposto a ser pago é de:" +imposto+" R$");
		}else{
			if((salario>1600)&&(salario<=2500)){
				double imposto = 0.19 * (salario - 1200);
				System.out.println("O imposto a ser pago é de:"+imposto+" R$");
				
			}else{
				if(salario>2500){
					double imposto = 0.23* (salario - 1200);
					System.out.println("O imposto a ser pago é de:"+imposto+" R$");
					
				}
			}
		}
	}
	
	
}
}
