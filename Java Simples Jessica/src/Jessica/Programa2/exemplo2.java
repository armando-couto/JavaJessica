package Jessica.Programa2;
import javax.swing.JOptionPane;

public class exemplo2 {
	private float altura;
	private float largura;
	public void lerDados(){
		altura = Float.parseFloat(
			JOptionPane.showInputDialog("Digite a altura"));
		largura = Float.parseFloat(
				JOptionPane.showInputDialog("Digite a largura"));
		
	}
	public void calcularPerimetro(){
		float perim = 2 * (altura + largura);
		JOptionPane.showMessageDialog(null,
				"Perimetro = " +perim);
	}
	public static void main (String args[]){
		exemplo2 ret1 = new exemplo2();
		exemplo2 ret2 = new exemplo2();
		ret1.lerDados();
		ret1.calcularPerimetro();
		ret2.lerDados();
		ret2.calcularPerimetro();
		System.exit(0);
	}
	}
	


