package Jessica;

import java.util.*;
class ordenaNomes{
	static Scanner s = new Scanner (System.in);
	public static void main (String args[]){
		
		String vetor[] = new String[5];
	    String nome;
		
		
		
		for(int i=0; i<5; i++){
			System.out.println("Escreva o "+(i+1)+"o nome:");
			nome = s.nextLine();
			vetor[i] = nome;
		

		
		}
		java.util.Arrays.sort( vetor );
		for(int i=0; i<5; i++){
			System.out.print(vetor[i]+",");
		}
	}
	}