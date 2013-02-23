package Jessica.PrimeiroPrograma;

public class exemplo {
	 private float base;
	  private float alt;
	  
	  public void iniciar (float a, float b){
	  	base = b;
	  	alt = a;
	  	
	  	
	  }    
	  	public void mostrarArea(){
	  		System.out.println("Area = " +base * alt);
	  		
	  	}    
	  	public static void main(String args[]){
	  		exemplo x = new exemplo();
	  		x.iniciar(10,2);
	  		x.mostrarArea();
	  		exemplo y = new exemplo();
	  		y.iniciar(5,3);
	  		y.mostrarArea();
	  	}	
	}


