package Jessica.Programass.src.dadosFuncionario;

import javax.swing.JOptionPane;

public class funcionario {
	private String cpf;
	private String nome;
	private float horasTrab;
	private float valorHora;
	private double salario;

	public void lerdados() {
		nome = JOptionPane.showInputDialog("Digite o nome do funcionario:\n");
		cpf = JOptionPane.showInputDialog("Digite o cpf do funcionario:\n");
		horasTrab = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o total de horas trabalhadas:\n"));
		valorHora = Float.parseFloat(JOptionPane
				.showInputDialog("Digite o valor da hora:\n"));

	}

	public void calcularSalario() {
		salario = horasTrab * valorHora;
	}

	public void mostrarDados() {
		JOptionPane.showMessageDialog(null, "O nome do funcionario �:\n" + nome
				+ "\nO cpf do funcionario �:\n" + cpf
				+ "O total de horas trabalhadas �:\n" + horasTrab
				+ "\nO valor da hora �:\n" + valorHora
				+ "O sal�rio a ser recebido ser� de:\n" + salario + "\n");

	}

}
