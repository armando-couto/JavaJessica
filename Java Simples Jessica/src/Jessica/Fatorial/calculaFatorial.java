package Jessica.Fatorial;

public class calculaFatorial {


public int calculo(int numero){
	if (numero == 0){
		return 1; 
	
		}else
	return numero * calculo(numero - 1);
	
}
}
