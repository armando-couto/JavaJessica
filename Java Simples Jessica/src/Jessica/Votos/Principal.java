package Jessica.Votos;


public class Principal {
public static void main (String args[]){
	Eleitor p = new Eleitor();
	p.votar();
	eleitorPT p1 = new eleitorPT();
	p1.votar();
	eleitorPSDB p2 = new eleitorPSDB();
	p2.votar();
}
}
