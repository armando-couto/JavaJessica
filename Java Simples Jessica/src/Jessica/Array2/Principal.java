package Jessica.Array2;

public class Principal {
public static void main (String args[]){
	int vetor1[] = new int[5];
	int vetor2[] = new int[5];
	int vetor3[] = new int[10];
	
	for(int i = 0; i < vetor1.length; i++){
	       vetor1[i] = i + 1;
		}
		 for(int i = 0; i <  vetor1.length; i++){ 
	         System.out.println(vetor1[i]);
	  	}
		 System.out.println("\n");
			for(int i = 0 ; i < vetor2.length ; i++){
			       vetor2[i] = i + 6;
				}
				 for(int i = 0  ; i <  vetor2.length ; i++){
			         System.out.println(vetor2[i]);
			  	}
				 Vetor p = new Vetor();
				 p.juntarVetor(vetor1,vetor2,vetor3);
				 
				 System.out.println("\n");
				 
				 for(int i = 0; i< 10; i++){
					 System.out.println(vetor3[i]);
				 }
}

}
