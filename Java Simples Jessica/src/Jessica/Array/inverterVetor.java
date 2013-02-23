package Jessica.Array;

public class inverterVetor {
	public void inverte(int[] Vetor){
		for(int i = Vetor.length; i>0; i--){
			for(int j = 0; j<i - 1; j++){
				int aux = Vetor[j+1];
				Vetor[j+1] = Vetor[j];
				Vetor[j] = aux; 
			}
		}
		
		
	}

}
