package Jessica.Banco;


public class fabricaContas {
	public static void main(String[] args){
	  ContaPoupanca cp = new ContaPoupanca();
	  cp.setAgencia(0);
	  cp.setQtdRende(0.5);
	  
	  contaCorrente cc = new contaCorrente();
	  cc.setAgencia(0);
	  cc.setTemCartaoCredito(false);
	  
	}

}
