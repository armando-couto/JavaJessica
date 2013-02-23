package Jessica.capsula;

import java.util.Scanner;
import Jessica.modificadores.A;

public class G {
	public static void main(String args []){
		A x = new A();
		Scanner s = new Scanner (System.in);
		System.out.println("Digite o valor de b: ");
		x.b = s.nextInt();
		System.out.println("D;igite o valor de c: ");
		x.c = s.nextInt();
		System.out.println("Digite o valor de d: ");
		x.d = s.nextInt();
		System.out.println("Digite o valor de f: ");
		x.f = s.nextInt();
		
		System.out.println("x.b ="+x.b );
		System.out.println("x.c ="+x.c );
		System.out.println("x.d ="+x.d );
		System.out.println("x.f ="+x.f );	
	}
}
