package Jessica.Array2;

public class Vetor {
int j = 0;
	public void juntarVetor(int vetor1[],int vetor2[], int vetor3[]){
		for(int i = 0; i<5; i++){
			vetor3[i] = vetor1[i]; 
		}
		for (int i = 5; i< 10; i++){
			vetor3[i] = vetor2[j];
			j++;
		} 
	}
	
}
