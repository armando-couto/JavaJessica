package Jessica.Array;

public class Principal {
	public static void main(String[] args) {
	int[] Vetor = new int[10];
	
	for(int i = 0; i < Vetor.length; i++){
       Vetor[i] = i + 1;
	}
	 for(int i = 0; i <  Vetor.length; i++){
         System.out.println(Vetor[i]);
  	}
     inverterVetor p = new inverterVetor();
     System.out.println("\n");
     p.inverte(Vetor);
     for(int i = 0; i <  Vetor.length; i++){
         System.out.println(Vetor[i]);
  	}
	}

}
