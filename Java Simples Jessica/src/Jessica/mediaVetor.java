package Jessica;

import java.util.*;
class mediaVetor{
	public static void main (String args[]){
		Scanner s = new Scanner (System.in);
		System.out.println("Qual o tamanho do vetor?");
		int c = s.nextInt();
	    int x[] = new int[c];
		int n;
		int soma = 0;
		
		
		
		System.out.println("Digite os valores do vetor");
		for(int i=0; i<x.length; i++){
		n = s.nextInt();
		x[i] = n;
		
	}
	System.out.println("\nOs valores são:");
	for(int i=0; i<x.length; i++){
		System.out.print(x[i]+",");
	}
	System.out.println("");

	System.out.println("\nMédia dos valores:");
	for(int i=0; i<x.length; i++){
		soma = soma + x[i];
		
		
	}
	double media = soma/x.length;
	System.out.println(media);
}
}