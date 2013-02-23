package Jessica;

import java.util.*;
class produtoMatrizes{
	public static void main(String args[]){
		Scanner s = new Scanner (System.in);
		int m1[][] = new int[2][2];
		int m2[][] = new int[2][2];
		int produto[][] = new int [2][2];
	
		
		System.out.println("Digite a primeira matriz");
		for(int i=0; i<m1.length; i++){
			for(int j=0; j<m1.length; j++){
				m1[i][j] = s.nextInt();
				
			}
		}
		System.out.println("Digite a segunda matriz:");
		for(int i = 0; i<m2.length; i++){
			for(int j = 0; j<m2.length; j++){
				m2[i][j] = s.nextInt();
			}
		}
		System.out.println("A soma das duas matrizes é:");
		for(int i = 0; i<produto.length; i++){
			for(int j = 0; j<produto.length; j++){
				produto[i][j] = (m1[0][j] * m2[0][j]);
				}
			for (int j=0; j<produto.length; j++){
				
			}	
			}
		for(int i = 0; i<produto.length; i++){
			for(int j = 0; j<produto.length; j++){
				System.out.print(produto[i][j]+" ");
		}
	}
	}
}